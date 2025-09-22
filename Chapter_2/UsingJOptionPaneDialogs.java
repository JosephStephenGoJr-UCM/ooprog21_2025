import javax.swing.JOptionPane;

class UsingJOptionPaneDialog{
    public static void main(String[] args){
        while (true) {
            String name = getName();

           if (name == null || name.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name cannot be blank. Please try again.");
                continue;
            }
                        
            int choice = JOptionPane.showConfirmDialog(null,"Do you want your name to be displayed?","Confirm",JOptionPane.YES_NO_OPTION);
                    
            if (choice == JOptionPane.YES_OPTION) {
               JOptionPane.showMessageDialog(null, "Welcome, " + name);
               break;
            } else {
               JOptionPane.showMessageDialog(null,"Welcome!");
               break;
            }
        }
    }
    
    public static String getName(){
      return JOptionPane.showInputDialog(null, "Enter your name:");
    }
}
