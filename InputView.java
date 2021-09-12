import javax.swing.*;
import java.awt.*;

class InputView extends JPanel{
    JLabel lb;
    JSpinner spn;
    JButton ok_btn;

    InputView(Kiosk kiosk){
        super();
        setLayout( new BoxLayout(this, BoxLayout.Y_AXIS) );

        add( Box.createVerticalGlue() );

        JPanel wrapper = new JPanel();
        add(wrapper);

        lb = new JLabel();
        lb.setAlignmentX(lb.CENTER_ALIGNMENT);
        lb.setHorizontalAlignment(JLabel.CENTER);
        add(lb);


        spn = new JSpinner( new SpinnerNumberModel(0, 0, 100000000, 100) );
        Component spn_editor = spn.getEditor();
        JFormattedTextField spn_txtf = ((JSpinner.DefaultEditor) spn_editor).getTextField();
        spn_txtf.setColumns(10);
        spn.setAlignmentX( spn.CENTER_ALIGNMENT );
        spn.addChangeListener(kiosk);
        wrapper.add(spn);

        ok_btn = new JButton("결제");
        ok_btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        ok_btn.setActionCommand("InputViewOK");
        ok_btn.addActionListener(kiosk);
        add(ok_btn);

        add( Box.createVerticalGlue() );
    }
    public void setSpinnerValue(int val){
        spn.setValue(val);
    }
    public void setMessage(String str){
        lb.setText(str);
    }

}