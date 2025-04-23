public class Zadatak1 {
        private String[] names={"Milos","Nikola","Pavle","Stefan"};

        public String getName(int index){
            if(index>0 && index<names.length){
                return names[index];
            }else {
                return "Invalid index";
            }

        }
}
