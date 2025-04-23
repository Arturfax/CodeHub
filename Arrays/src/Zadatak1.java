public class Zadatak1 {
        private static String[] imena={"Milos","Nikola","Pavle","Stefan"};

        public static String getName(int index){
            if(index>0 && index<imena.length){
                return imena[index];
            }else {
                return "Invalid index";
            }
        }
}
