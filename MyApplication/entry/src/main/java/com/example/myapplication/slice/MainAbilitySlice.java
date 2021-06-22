package com.example.myapplication.slice;

import com.example.myapplication.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Text;
import ohos.agp.components.TextField;


public class MainAbilitySlice extends AbilitySlice {
    Button button;
    TextField tf,tf2;
    Text txresult;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        button = (Button) findComponentById(ResourceTable.Id_button);
         tf = (TextField) findComponentById(ResourceTable.Id_text_field);
         tf2 = (TextField) findComponentById(ResourceTable.Id_text_fieldb);
         txresult = (Text) findComponentById(ResourceTable.Id_textresult);
        button.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                double a = Double.parseDouble(tf.getText());
                double b = Double.parseDouble(tf2.getText());
                double result = a + b;
                txresult.setText("Result: "+result);
                // Add the event processing logic for a click event on the button.
            }
        });
    }

    @Override
    public void onActive() {
        super.onActive();

    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
