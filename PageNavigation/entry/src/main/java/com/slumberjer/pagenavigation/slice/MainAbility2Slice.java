package com.slumberjer.pagenavigation.slice;

import com.slumberjer.pagenavigation.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Text;

public class MainAbility2Slice extends AbilitySlice {
    Text passtext;

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main2);
        passtext = (Text) findComponentById(ResourceTable.Id_text_output);
        if (getAbility() !=null){
            if (getAbility().getIntent().hasParameter("TEST_KEY")){
                String valfrompar =  getAbility().getIntent().getStringParam("TEST_KEY");
                passtext.setText(valfrompar);
            }else{
                passtext.setText("No Value pass");
            }
        }
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
