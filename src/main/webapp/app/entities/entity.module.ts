import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
    imports: [
        RouterModule.forChild([
            {
                path: 'period',
                loadChildren: './period/period.module#Examenjhipster2PeriodModule'
            },
            {
                path: 'project',
                loadChildren: './project/project.module#Examenjhipster2ProjectModule'
            },
            {
                path: 'team',
                loadChildren: './team/team.module#Examenjhipster2TeamModule'
            },
            {
                path: 'sprint',
                loadChildren: './sprint/sprint.module#Examenjhipster2SprintModule'
            },
            {
                path: 'story',
                loadChildren: './story/story.module#Examenjhipster2StoryModule'
            },
            {
                path: 'student',
                loadChildren: './student/student.module#Examenjhipster2StudentModule'
            },
            {
                path: 'review',
                loadChildren: './review/review.module#Examenjhipster2ReviewModule'
            }
            /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
        ])
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class Examenjhipster2EntityModule {}
