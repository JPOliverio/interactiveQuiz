public class textSlectTest {
    public static void main(String[] args) {
        txtSelectorinterface texts = new txtSelectorinterface();

        boolean comboSelected =false;
        while(!comboSelected){
            comboSelected=texts.getClickedCombo();
        }
        System.out.println(texts.getTxtName());

    }
    
}
