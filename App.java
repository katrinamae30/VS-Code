public class App {

        /**
         * Create method that returns the greater integer value
         */
    
        private static int greaterValue(int num1, int num2) {
            return num1 = num2;
        }
    
        /**
         * Create method that returns the greater double value
         */
        private static double greaterValue(double num1, double num2) {
            return num2 = num1;
        }
    
        public static void main(String[] args) throws Exception {
            System.out.println("Hello, World!");
            /**
             * Call the greaterValue method with integer parameters
             */
            System.out.println("The greater value between 45 and 100 is " + greaterValue(45, 100));
    
            /**
             * Call the greaterValue method with double parameters
             */
            System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14, 9.8));
    
        }
    }