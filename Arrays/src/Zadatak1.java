public class Zadatak1 {
        private static String[] names={"Milos","Nikola","Pavle","Stefan"};

        public static String getName(int index){
            if(index>0 && index<names.length){
                return names[index];
            }else {
                return "Invalid index";
            }
        }
}
