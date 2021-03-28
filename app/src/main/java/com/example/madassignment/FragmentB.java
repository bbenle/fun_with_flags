package com.example.madassignment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentB extends Fragment
{
    // private class fields
    private GridLayoutManager glm;
    private ImageView flag;
    private TextView flagName;
    private FragmentA fragA;
    private FragmentC fragC;
    private FragmentD fragD;
    private FragmentE fragE;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup ui, Bundle bundle)
    {
        View view = inflater.inflate(R.layout.fragment_b, ui, false);

        // GridLayoutManager starts off with a span count of 2 and starts off vertically
        // span count is number of columns
        glm = new GridLayoutManager(getActivity(), 2, GridLayoutManager.VERTICAL, false);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.fragment_b);
        rv.setLayoutManager(glm);

        List<Flag> data = new ArrayList<Flag>();
        FlagData flagData = FlagData.get();

        // loop from ii = 0 to when ii is less than size of flagData
        for (int ii = 0; ii < flagData.size(); ii++)
        {
            data.add(flagData.get(ii));
        }

        MyAdapter adapter = new MyAdapter(data);
        rv.setAdapter(adapter);
        fragA.setTheFragment(); // sets the fragment
        return view;
    }

    private class MyAdapter extends RecyclerView.Adapter<MyDataVHolder>
    {
        private List<Flag> data;

        public MyAdapter(List<Flag> data) {
            this.data = data;
        }

        @Override
        public int getItemCount() {
            return data.size();
        }

        @Override
        public MyDataVHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater li = LayoutInflater.from(getActivity());
            return new MyDataVHolder(li, parent);
        }

        @Override
        public void onBindViewHolder(MyDataVHolder vh, int index)
        {
            vh.bind(data.get(index));
        }
    }

    private class MyDataVHolder extends RecyclerView.ViewHolder
    {
        private Flag selectedFlag;

        public MyDataVHolder(LayoutInflater li, ViewGroup parent)
        {
            super(li.inflate(R.layout.flag_selection, parent, false));

            flag = (ImageView) itemView.findViewById(R.id.flagButton); // image of the flag on fragmentB
            flagName = (TextView) itemView.findViewById(R.id.flagName); // name of the flag on fragmentB

            flag.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    FlagData.setSelectedFlag(selectedFlag); //sets variable selectedFlag as the flag that user clicks on
                    FragmentTransaction ft = getFragmentManager().beginTransaction();

                    // this section is for tablet mode
                    if (getString(R.string.device_configuration).equals("Tablet"))
                    {
                        // sets fragmentContainer2 which is the right side of middle fragment to be visible
                        getActivity().findViewById(R.id.fragmentContainer2).setVisibility(View.VISIBLE);
                        ft.replace(R.id.fragmentContainer, fragD);
                        ft.addToBackStack(null); // replaced transaction is saved to the back stack so user can reverse the transaction
                        ft.hide(fragE);
                        ft.add(R.id.fragmentContainer2, fragE);
                    }
                    else // this section is for phone mode
                    {
                        ft.replace(R.id.fragmentContainer, fragD); // replaces the fragmentContainer with FragmentD
                        ft.addToBackStack(null); // replaced transaction is saved to the back stack so user can reverse the transaction
                    }
                    ft.commit();

                    fragC.setTheFragment(); // sets the fragment to be this current fragment
                    fragC.prevButtonHider(); // hides previous button
                }
            });
        }

        public void bind(Flag data)
        {
            flag.setImageResource(data.getDrawableId()); // sets the picture of the flag
            flagName.setText(data.getLabel()); // set the name of the flag
            this.selectedFlag = data;
        }
    }

    // sets the GridLayoutManager to have a certain amount of columns ranging from 1-3
    public void setColumn(int col)
    {
        glm.setSpanCount(col);
    }

    // GETTERS
    public GridLayoutManager getGridLayoutManager()
    {
        return glm;
    }

    // SETTERS
    public void setFragC(FragmentC fragC)
    {
        this.fragC = fragC;
    }

    public void setFragD(FragmentD fragD)
    {
        this.fragD = fragD;
    }

    public void setFragA(FragmentA fragA)
    {
        this.fragA = fragA;
    }

    public void setFragE(FragmentE fragE)
    {
        this.fragE = fragE;
    }
}
