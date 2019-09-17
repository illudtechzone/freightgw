import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { NgbDateAdapter } from '@ng-bootstrap/ng-bootstrap';

import { NgbDateMomentAdapter } from './util/datepicker-adapter';
import { FreightgwSharedLibsModule, FreightgwSharedCommonModule, HasAnyAuthorityDirective } from './';

@NgModule({
    imports: [FreightgwSharedLibsModule, FreightgwSharedCommonModule],
    declarations: [HasAnyAuthorityDirective],
    providers: [{ provide: NgbDateAdapter, useClass: NgbDateMomentAdapter }],
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
