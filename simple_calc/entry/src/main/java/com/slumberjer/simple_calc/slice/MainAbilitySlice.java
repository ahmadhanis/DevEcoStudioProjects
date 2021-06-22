package com.slumberjer.simple_calc.slice;

import com.slumberjer.simple_calc.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Text;
import ohos.agp.components.TextField;

public class MainAbilitySlice extends AbilitySlice {
    TextField tfa;
    TextField tfb;
    Button btn;
    Text txtresult;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        tfa = (TextField) findComponentById(ResourceTable.Id_tf_numa);
        tfb = (TextField) findComponentById(ResourceTable.Id_tf_numb);
        btn = (Button) findComponentById(ResourceTable.Id_button);
        txtresult = (Text) findComponentById(ResourceTable.Id_text_result);
        btn.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                double a = Double.parseDouble(tfa.getText());
                double b = Double.parseDouble(tfb.getText());
                double result = a + b;
                txtresult.setText("Result:"+result);
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
