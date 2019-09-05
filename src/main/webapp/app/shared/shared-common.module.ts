import { NgModule } from '@angular/core';

import { FreightgwSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
  imports: [FreightgwSharedLibsModule],
  declarations: [JhiAlertComponent, JhiAlertErrorComponent],
  exports: [FreightgwSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class FreightgwSharedCommonModule {}
