public class Zadatak1 {
        private static String[] imena={"Milos","Nikola","Pavle","Stefan"};

        public static String getName(int index){
            if(index>0 && index<imena.length){
                return imena[index];
            }else {
                return "Invalid index";
            }
        }

        //main funkcija
        public static void main(String[] args){
            int TrazeniIndex=3;
            String ime=getName(TrazeniIndex);

            System.out.println("Ime za dati index je->" + ime);
        }
}
