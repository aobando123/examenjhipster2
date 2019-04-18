import { NgModule } from '@angular/core';

import { Examenjhipster2SharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [Examenjhipster2SharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [Examenjhipster2SharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class Examenjhipster2SharedCommonModule {}
