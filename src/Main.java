public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int salary = 15000;
        int total = 0;
        int monthe = 0;
        while (total <= 2_459_000) {
            monthe++;
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + monthe + ", сумма накоплений равна " + total + " рублей");
        }
        //Task 2
        System.out.println("Task 2");
        int num = 0;
        while (num < 10) {
            num++;
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Task 3
        System.out.println("Task 3");
        int people = 12_000_000;
        int born = 17;// рождаемость на 1000 чел
        int dead = 8; // смертность на 1000 чел
        int totalBorn = (people / 1000) * born;
        int totalDead = (people / 1000) * dead;
        int year = 0;
        while (year < 10) {
            year++;
            people = people + totalBorn - totalDead;//кол-во чел + общая рождаемость - общая смертность
            System.out.println("Год " + year + ", численность населения " + people);
        }
        //Task 4-5
        System.out.println("Task 4-5");
        int contrib = 15000;
        int montheNew = 0;
        while (contrib <= 12_000_000) {
            montheNew++;
            contrib = contrib + (contrib / 100) * 7;
            if (montheNew % 6 == 0) {
                System.out.println("Месяц " + montheNew + ", сумма накоплений " + contrib);
            }
        }
        //Task 6
        System.out.println("Task 6");
        int contribNew = 15000;
        int newMonth = 0;
        while (newMonth < 108) {
            newMonth++;
            contribNew = contribNew + (contribNew / 100) * 7;
            if (newMonth % 6 == 0) {
                System.out.println("Месяц " + newMonth + ", сумма накоплений " + contribNew);
            }
        }
        //Task 7
        System.out.println("Task 7");
        int friday = 6;
        for (; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число.Необходимо подготовить отчет");
        }
//         while(friday<=31){
//            friday += 7;
//            System.out.println("Сегодня пятница, " + friday + "-е число.Необходимо подготовить отчет");
//        }

        //Task 8
        System.out.println("Task 8");
        int currentYear = 2024;


        int cometPeriod = 79; // Период кометы
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;

        for (int yearNew = startYear; yearNew <= currentYear; yearNew++) {
            if (yearNew % cometPeriod == 0) {
                System.out.println(yearNew);
            }
        }

        int nextCometYear = currentYear + (cometPeriod - (currentYear % cometPeriod));
        if (nextCometYear <= endYear) {
            System.out.println(nextCometYear);
        } else {
            System.out.println("Комета не появится в течение ближайших 100 лет.");
        }

    }
}