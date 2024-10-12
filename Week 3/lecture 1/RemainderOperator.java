public class RemainderOperator {
        public static void main(String[] args) {
            String[] daysOfWeek = {
                "Sunday", "Monday", "Tuesday", "Wednesday", 
                "Thursday", "Friday", "Saturday"
            };
            
            int todayIndex = 2; // Tuesday
            int daysToAdd = 100;
            
            int resultIndex = (todayIndex + daysToAdd) % 7;
            
            System.out.println("In 100 days, it will be: " + daysOfWeek[resultIndex]);
        }
    }
