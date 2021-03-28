package com.example.madassignment;

import java.util.Arrays;
import java.util.List;

// singleton class
public class QuestionData
{
    // private class fields
    private static Question selectedQuestion;

    // GETTERS for the list of questions for each country
    public List<Question> getAustraliaQuestionList () {
        return Arrays.asList(
                new Question("What is the capital city of Australia?", "Melbourne", "Sydney", "Canberra", "Perth", 500, 3, "Q1", "Canberra", true),
                new Question("How many stars are there on the Australian flag?", "5", "6", "7", "8", 5, 3, "Q2", "6", false),
                new Question("What two animals are on Australia’s Commonwealth Coat of Arms?", "Kangaroo, Koala", "Kangaroo, Emu", "Kangaroo, Wombat", "Koala, Emu", 6, 3, "Q3", "Kangaroo, Emu", false),
                new Question("Who was the first Australian Prime Minister?", "John Curtin", "Alfred Deakin", "Bob Hawke", "Sir Edmond Barton", 5, 4, "Q4", "Sir Edmond Barton",false),
                new Question("True or False. The Great Barrier Reef in Queensland is the largest coral reef system in the world.", "True", "False", null, null, 4, 2, "Q5", "True",false),
                new Question("As of 2020, what is Australia’s approximate population?", "25 million", "30 million", "35 million", null, 5, 3, "Q6", "25 million",false),
                new Question("How many sides are there on an Australia 50 cent coin?", "8", "10", "12", "13", 7, 4, "Q7", "12", false));
    }

        public List<Question> getJapanQuestionList () {
            return Arrays.asList(
                    new Question("What is the capital city of Japan?", "Kyoto", "Osaka", "Tokyo", "Nara", 7, 5, "Q1", "Tokyo",true),
                    new Question("How tall is Mt Fuji?", "3,656m", "3,776m", "3,923m", "4,031m", 6, 4, "Q2", "3,766m",false),
                    new Question("In which prefecture is the Arashiyama Bamboo Forest located?", "Kyoto", "Osaka", "Tokyo", "Nagano", 6, 3, "Q3", "Kyoto",false),
                    new Question("What is the top operational speed of the Shinkansen aka The Bullet Train?", "200km/ph", "260km/ph", "320km/ph", "400km/ph", 7, 4, "Q4", "320km/ph",false),
                    new Question("What is the name of the currency used in Japan?", "Dollar", "Baht", "Dong", "Yen", 4, 1, "Q5", "Yen",false),
                    new Question("True or False. Japan has the most vending machines in the world.", "True", "False", null, null, 5, 2, "Q6", "True",false),
                    new Question("As of 2020, what is Japan's approximate population", "120 million", "126 million", "132 million", "150 million", 14, 8, "Q7", "126 million", false));
        }

        public List<Question> getUSAQuestionList () {
            return Arrays.asList(
                    new Question("How many red and white stripes are there on the USA flag?", "10", "11", "12", "13",5, 3, "Q1", "13",true),
                    new Question("How many white stars are there on the USA flag?", "50", "60", "70", null, 6, 3, "Q2", "50",false),
                    new Question("As of 2020, what is the approximate population of the USA?", "311 million", "321 million", "331 million", null, 6, 2, "Q3", "331 million",false),
                    new Question("What is the name of the currency used in the USA?", "Dollar", "Pound", "Euro", null, 5, 2, "Q4", "Dollar",false),
                    new Question("What is the capital city of the USA?", "New York", "Washington DC", "Chicago", "Los Angeles", 6, 3, "Q5", "Washington DC",false),
                    new Question("What is the largest city in the USA?", "New York", "Washington DC", "Chicago", "Los Angeles", 7, 4, "Q6", "New York",false),
                    new Question("Who was the first president of the USA?", "Abraham Lincoln", "George Washington", "Thomas Jefferson", "Neil Armstrong", 6, 3, "Q7", "George Washington",false));
        }

        public List<Question> getCanadaQuestionList () {
            return Arrays.asList(
                    new Question("What is the name of the largest city in Canada", "Vancouver", "Toronto", "Montreal", "Ottawa", 6, 3, "Q1", "Toronto",true),
                    new Question("As of 2020, what is the approximate population of Canada?", "30 million", "34 million", "38 million", "45 million", 6, 3, "Q2", "38 million",false),
                    new Question("How do you spell Canada?", "Canda", "Canadia", "Candana", "Canada", 5, 10, "Q3", "Canada",false),
                    new Question("What is the name of the currency used in Canada?", "Yen", "Dollar", "Euro", null, 6, 3, "Q4", "Dollar",false),
                    new Question("What two colours are present on the flag of Canada?", "Red, white", "Red, blue", "Red, yellow", "Red, green", 6, 3, "Q5", "Red, white",false),
                    new Question("True or False. Does it snow in Canada?", "True", "False", null, null, 4, 2, "Q6", "True",false),
                    new Question("True or False. Is Canada the second largest country in the world?", "True", "False", null, null, 4, 2, "Q7", "True", false));
        }

        public List<Question> getUKQuestionList () {
            return Arrays.asList(
                    new Question("As of 2020, what is the approximate population of the United Kingdom?", "65 million", "68 million", "71 million", "73 million", 6, 3, "Q1", "68 million",true),
                    new Question("What is the name of the currency used in the United Kingdom?", "Euro", "Dollar", "Pound", "Franc", 6, 3, "Q2", "Pound",false),
                    new Question("What is the name of the flag of the United Kingdom?", "The Union Cross", "The Union Plus", "The Union Flag", "The Union Jack", 5, 4, "Q3", "The Union Jack",false),
                    new Question("What is the capital city of the United Kingdom?", "London", "Manchester", "Liverpool", "Newcastle", 5,2, "Q4", "London",false),
                    new Question("What are the national colours of the United Kingdom?", "Blue, white, red", "Blue, white, yellow", "Blue, yellow, red", "Blue, red", 5, 2, "Q5", "Blue, white, red",false),
                    new Question("What is the largest country in the United Kingdom?", "Scotland", "England", "Ireland", "Wales", 4, 2, "Q6", "England",false),
                    new Question("True or False. Ben Nevis is the United Kingdom's highest mountain, standing at 1,345m", "True", "False", null, null, 5, 3, "Q7", "True", false));
        }

        public List<Question> getBrazilQuestionList () {
            return Arrays.asList(
                    new Question("As of 2020, what is the approximate population of Brazil?", "203 million", "212 million", "230 million", "250 million", 6, 3, "Q1", "212 million",true),
                    new Question("What is the capital city of Brazil?", "Brasilia", "Rio de Janeiro", "Sao Paulo", "Natal", 5, 2, "Q2", "Brasilia",false),
                    new Question("What is the name of the currency used in Brazil?", "Rupee", "Peso", "Real", "Rand", 6, 3, "Q3","Real",false),
                    new Question("What is the official language spoken in Brazil?", "English", "Brazilian", "Spanish", "Portuguese", 5, 3, "Q4", "Portuguese",false),
                    new Question("What four colours make up the flag of Brazil?", "Red, blue, white, yellow", "Green, blue, white, yellow", "Orange, white, black, red", "Blue, red, white, black", 5, 2, "Q5", "Green, blue, white, yellow",false),
                    new Question("True or False. The name Brazil comes from a type of plant called Brazilar", "True", "False", null, null, 4, 2, "Q6", "False", false));
        }

        public List<Question> getKoreaQuestionList () {
            return Arrays.asList(
                    new Question("As of 2020, what is the approximate population of Korea?", "41 million", "51 million", "61 million", "71 million", 5, 3, "Q1", "51 million", true),
                    new Question("What is the name of currency used in Korea?", "Won", "Peso", "Yen", "Dong", 5, 3, "Q2", "Won",false),
                    new Question("What is the capital city of Korea?", "Seoul", "Busan", "Daejeon", "Incheon", 6, 3, "Q3", "Seoul",false),
                    new Question("True or False. The smallest mountain in South Korea is nmaed Halla-san.", "True", "False", null, null, 5, 3, "Q4", "False",false),
                    new Question("True or False. Nakdong River is the longest river in South Korea, at 510km long.", "True", "False", null, null, 5, 2, "Q5", "True",false),
                    new Question("What is the official language spoken in Korea?", "Korean", "Thai", "Bengali", "Urdu", 5, 3, "Q6", "Korean",false));
        }

        public List<Question> getSpainQuestionList () {
            return Arrays.asList(
                    new Question("What is the name of the currency used in Spain?", "Euro", "Dollar", "Pound", "Franc", 6, 3, "Q1", "Euro",true),
                    new Question("As of 2020, what is the approximate population of Spain?", "40 million", "47 million", "53 million", "61 million", 5, 3, "Q2", "47 million",false),
                    new Question("What is the capital city of Spain?", "Madrid", "Barcelona", "Valencia", "Toledo", 6, 2, "Q3", "Madrid",false),
                    new Question("What is the official language spoken in Spain?", "Spanish", "Russian", "Portugeuse", "English", 6, 3, "Q4", "Spanish",false),
                    new Question("True or False. Spain is three times larger than the size of the United Kingdom.", "True", "False", null, null, 5, 2, "Q5", "True",false),
                    new Question("True or False. The largest natural lake in Spain is named Lake Sanabria", "True", "False", null, null, 5, 2, "Q6", "True",false));
        }

        public List<Question> getRussiaQuestionList () {
            return Arrays.asList(
                    new Question("As of 2020, what is the approximate population of Russia?", "140 million", "146 million", "152 million", "170 million", 6, 3, "Q1", "146 million", true),
                    new Question("What is the name of the currency used in Russia?", "Dollar", "Rupee", "Baht", "Rouble", 5, 4, "Q2", "Rouble",false),
                    new Question("What is the official language spoken in Russia?", "Russian", "English", "Portuguese", "Bengali", 6, 2, "Q3", "Russian",false),
                    new Question("What three colours are present on the Russian flag in order from top to bottom?", "Red, blue, white", "White, blue, red", "Blue, white, red", "Blue red, white", 5, 3, "Q4", "White, blue, red",false),
                    new Question("What is the capital city of Russia?", "Moscow", "Kazan", "Samara", "Saint Petersburg",6, 4, "Q5", "Moscow",false),
                    new Question("True or False. Russia is the largest country in the world.", "True", "False", null, null, 5, 3, "Q6", "True",false));
        }

        public List<Question> getGermanyQuestionList () {
            return Arrays.asList(
                    new Question("As of 2020, what is the approximate population of Germany?", "80 million", "84 million", "88 million", "95 million", 5, 3, "Q1", "84 million", true),
                    new Question("What is the official language spoken in Germany?", "English", "German", "Portuguese", "Spanish",6, 2, "Q2", "German",false),
                    new Question("What is the name of the currency used in Germany?", "Euro", "Dollar", "Pound", "Franc", 6, 3, "Q3", "Euro",false),
                    new Question("What is the capital city of Germany?", "Munich", "Hamburge", "Cologne", "Berlin", 5, 2, "Q4", "Berlin",false),
                    new Question("True or False. The first printed book was in German.", "True", "False", null, null, 5, 3, "Q5", "True",false));
        }

        public List<Question> getVietnamQuestionList () {
            return Arrays.asList(
                    new Question("As of 2020, what is the approximate population of Vietnam?", "92 million", "94 million", "97 million", "103 million", 6, 4, "Q1", "97 million", true),
                    new Question("What is the official language spoken in Vietnam?", "Vietnamese", "English", "Mandarin", "Bengali", 5, 2, "Q2", "Dong",false),
                    new Question("What is the name of the currency used in Vietnam?", "Dollar", "Pound", "Euro", "Dong", 6, 3, "Q3", "Vietnamese",false),
                    new Question("What is the capital city of Vietnam?", "Hanoi", "Ho Chi Minh", "Can Tho", "Cai Be", 6, 3, "Q4", "Hanoi",false),
                    new Question("What are the primary colours of the flag of Vietnam?", "Red, yellow", "Blue, white", "Yellow, blue", "White, red", 5, 2, "Q5", "Red, yellow",false));
        }

        public List<Question> getGreeceQuestionList () {
            return Arrays.asList(
                    new Question("As of 2020, what is the approximate population of Greece?", "5 million,", "7 million", "10 million", "15 million", 5, 2, "Q1", "10 million", true),
                    new Question("What is the official language spoken in Greece?", "Greek", "English", "Urdu", "Vietnamese", 6, 3, "Q2", "Greek",false),
                    new Question("What is the capital city of Greece?", "Patras", "Athens", "Thessaloniki", "Chania", 5, 3, "Q3", "Athens",false),
                    new Question("What is the name of the currency used in Greece?", "Pound", "Dollar", "Rouble", "Euro", 6, 3, "Q4", "Euro",false),
                    new Question("What are the primary colours of the flag of Greece?", "Red, white, blue", "Blue, white", "Blue yellow", "Blue, white, yellow", 6, 2, "Q5", "Blue, white",false));
        }

        public List<Question> getArgentinaQuestionList () {
            return Arrays.asList(
                    new Question("As of 2020, what is the approximate population of Argentina?", "30 million", "35 million", "40 million", "45 million", 5, 2, "Q1", "45 million", true),
                    new Question("What is the name of the currency used in Argentina?", "Dollar", "Euro", "Rouble", "Peso", 6, 3, "Q2", "Peso",false),
                    new Question("What is the official language spoken in Argentina?", "Portugese", "Spanish", "English", "Russian", 5, 2, "Q3", "Spanish",false),
                    new Question("What is the capital city of Argentina?", "Buenos Aires", "Mendoza", "Salta", "La Plata",5, 2, "Q4", "Buenos Aires",false),
                    new Question("True or False. Argentina is the second largest country in the world.", "True", "False", null, null, 6, 3, "Q5", "False",false));
        }

        public List<Question> getMalaysiaQuestionList () {
            return Arrays.asList(
                    new Question("As of 2020, what is the approximate population of Malaysia?", "20 million", "27 million", "33 million", "38 million", 6, 3, "Q1", "33 million", true),
                    new Question("What is the name of the currency used in Malaysia?", "Ringgit", "Rouble", "Won", "Yen", 5, 2, "Q2", "Ringgit",false),
                    new Question("What is the capital city of Malaysia?", "Malacca", "Penang", "Kota Kinabalu", "Kuala Lumpur", 6, 3, "Q3", "Kuala Lumpar",false),
                    new Question("What is the official language spoken in Malaysia?", "English", "Malaysian", "Thai", "Malay", 5, 2, "Q4", "Malay",false),
                    new Question("True or False. The longest river is the Rajang river at 563km in length.", "True", "False", null, null, 6, 2, "Q5", "True",false));
        }

        public List<Question> getChinaQuestionList () {
            return Arrays.asList(
                    new Question("As of 2020, what is the approximate population of China?", "982 million", "1.4 billion", "1.6 billion", "2.1 billion", 5, 3, "Q1", "1.4 billion", true),
                    new Question("What is the name of the currency used in China?", "Renminbi", "Dong", "Rouble", "Baht", 6, 2, "Q2", "Renminbi",false),
                    new Question("What is the capital city of China?", "Beijing", "Shanghai", "Shenzhen", "Guangzhou", 6, 3, "Q3", "Beijing",false),
                    new Question("What is the official language spoken in China?", "Chinese", "Mandarin", "Bengali", "Urdu", 5, 2, "Q4", "Mandarin",false),
                    new Question("True or False. China is the most populated country in the world.", "True", "False", null, null, 6, 2, "Q5", "True",false));
        }

        public List<Question> getFranceQuestionList () {
            return Arrays.asList(
                    new Question("As of 2020, what is the approximate population of France?", "55 million", "60 million", "65 million", "70 million", 5, 3, "Q1", "65 million", true),
                    new Question("What is the official language spoken in France?", "English", "Mandarin", "French", "Portuguese", 6, 3, "Q2", "French",false),
                    new Question("What is the capital city of France?", "Paris", "Nice", "Marseille", "Strasbourg", 6, 2, "Q3", "Paris",false),
                    new Question("What is the name of the currency used in France?", "Rouble", "Franc", "Baht", "Dollar", 5, 3, "Q4", "Franc",false),
                    new Question("Are the three stripes in the flag of France, horizontal or vertical?", "Horizontal", "Vertical", null, null, 5, 5, "Q5", "Vertical",false));
    }

    private static QuestionData instance = null;

    public static QuestionData get()
    {
        if (instance == null) {
            instance = new QuestionData();
        }
        return instance;
    }

    // GETTERS
    public static Question getSelectedQuestion()
    {
        return selectedQuestion;
    }

    // SETTERS
    public static void setSelectedQuestion(Question selectedQuestion)
    {
        QuestionData.selectedQuestion = selectedQuestion;
    }
}

