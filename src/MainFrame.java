import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    private Button btnExit = new Button("Exit");
    public MainFrame(){
        initComp();
    }
    private void initComp(){
//        this.setLocation(100,120);
//        this.setSize(400,300);
        this.setBounds(100,120,400,300);
        this.setLayout(null);
        btnExit.setBounds(150,110,80,30);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });


        this.add(btnExit);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
             System.exit(0);
            }
        });

    }

}
