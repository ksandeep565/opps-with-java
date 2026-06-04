import javax.swing.*; public class ComboBoxExample
{
JFrame f; ComboBoxExample()
{
 f=new JFrame("ComboBox Example");
 String country[]={"India","Aus","U.S.A","England","Newzealand"};
 JComboBox cb=new JComboBox(country);
 f.add(cb);
 f.setSize(400,500);
 f.setVisible(true);
} public static void main(String[] args)
{
 new ComboBoxExample(); } } 