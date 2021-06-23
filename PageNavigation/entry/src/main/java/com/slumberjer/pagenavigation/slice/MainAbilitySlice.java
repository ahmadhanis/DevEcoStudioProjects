package com.slumberjer.pagenavigation.slice;

import com.slumberjer.pagenavigation.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.TextField;

public class MainAbilitySlice extends AbilitySlice {
    TextField textField;
    Button btn;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        textField = (TextField) findComponentById(ResourceTable.Id_tf_text);
        btn = (Button) findComponentById(ResourceTable.Id_button);
        btn.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                String mytext = textField.getText();
                Intent intent = new Intent();
                Operation operation = new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName("com.slumberjer.pagenavigation")
                        .withAbilityName("com.slumberjer.pagenavigation.MainAbility2")
                        .build();
                intent.setParam("TEST_KEY", mytext);
                intent.setOperation(operation);
                startAbility(intent);


//                AbilitySlice targetSlice = new MainAbility2Slice();
//                Intent intent = new Intent();
//                intent.setParam("TEST_KEY", mytext);
//                present(targetSlice,intent);
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
