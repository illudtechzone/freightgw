import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { FreightgwSharedCommonModule, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [FreightgwSharedCommonModule],
  declarations: [HasAnyAuthorityDirective],
  exports: [FreightgwSharedCommonModule, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class FreightgwSharedModule {
  static forRoot() {
    return {
      ngModule: FreightgwSharedModule
    };
  }
}
