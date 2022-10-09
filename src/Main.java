public class Main {
    public static void main(String[] args) {
        int age=20;
        if (age>=18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age<18)  {
            System.out.println("Совершеннолетие ещё не наступило, придётся подождать.");
        }

        int Age1=8, Age2=20, Age3=25;
        if (Age1>=7) {
            System.out.println("Ходит в школу");
        }
        if (Age2>=18) {
            System.out.println("Можно учиться в университете");
        }
        if (Age3>=24) {
            System.out.println("Пора искать работу");
        }

        int passenger=50, capacity=102, seats=60;
        if (passenger<60) {
            System.out.println("Есть свободные сидячие места- "+(seats-passenger));
        }
        if (passenger<102) {
            System.out.println("Есть свободные стоячие места- "+(capacity-passenger));
        }
        if (passenger>=102) {
            System.out.println("Свободных мест нет");
        }

        int age1=17;
        if (age1>=18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else  {
            System.out.println("Совершеннолетие ещё не наступило, придётся подождать.");
        }


        if (Age1>=7 && Age1<=18) {
            System.out.println("Ходит в школу");
        } else
            if (Age1>=18 && Age1<24) {
            System.out.println("Можно учиться в университете");
            } else
                if (Age1>=24) {
                System.out.println("Пора искать работу");
            }

        int passenger1=70, capacity1=102, seats1=60;
        if (passenger1<60) {
            System.out.println("Есть свободные сидячие места- "+(seats1-passenger1));
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (passenger1<102) {
            System.out.println("Есть свободные стоячие места- "+(capacity1-passenger1));
        } else {
            System.out.println("Стоячих мест нет");
        }


        /*Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад;
Если человек от 7 до 18 лет, то ему нужно ходить в школу;
Если человеку больше 18 лет, но меньше 24, то его место в университете;
А если человеку больше 24, то ему пора ходить на работу*/
        int Age4=25;
        if (Age4>2 && Age4<=6) {
            System.out.println("Если возраст человека равен "+Age4+", то ему нужно ходить в детский сад");
        } else
            if (Age4>=7 && Age4<=18){
                System.out.println("Если возраст человека равен "+Age4+", то ему нужно ходить в школу");
                } else
                    if (Age4>18 && Age4<=24){
                        System.out.println("Если возраст человека равен "+Age4+", то ему нужно ходить в университет");
                        }
                        else
                            if (Age4>24) {
                            System.out.println("Если возраст человека равен "+Age4+", то ему нужно ходить на работу");
        }

        //Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
        //Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.
        //Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        int AgeChild=4;
        if (AgeChild>5 && AgeChild<14) {
            System.out.println("может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else
            if (AgeChild>=14) {
                System.out.println("может кататься без сопровождения взрослого.");
            } else
                if (AgeChild<=5) {
                    System.out.println("не может кататься на аттракционе.");
                }

        int one=4;
        int two=2;
        int three=3;
        if (one>two && one>three) {
            System.out.println(one + " самое большое число");
        }else
                if (two>one && two>three) {
                    System.out.println(two+" самое большое число");
                }else
                    if (three>one && three>two) {
                        System.out.println(three + " самое большое число");
                    }else {
                            System.out.println("все числа равны");
                        }


    }
}