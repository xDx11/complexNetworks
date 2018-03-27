import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule }   from '@angular/forms';
import { RouterModule }   from '@angular/router';
import { HttpModule }    from '@angular/http';

import { AppComponent }  from './app.component';
import { HeroDetailComponent } from './heroesTutorial/heroDetail/hero-detail.component';
import { HeroesComponent }     from './heroesTutorial/heroes/heroes.component';
import { HeroService }         from './heroesTutorial/heroes/hero.service';
import { DashboardComponent }     from './heroesTutorial/dashboard/dashboard.component';
import { HeroSearchComponent} from './heroesTutorial/heroesSearch/hero-search.component';

import { AppRoutingModule }     from './app-routing.module';

// Imports for loading & configuring the in-memory web api
import { InMemoryWebApiModule } from 'angular-in-memory-web-api';
import { InMemoryDataService }  from './heroesTutorial/in-memory-data.service';


@NgModule({
  imports:      [
    BrowserModule,
    FormsModule,
    HttpModule,
    InMemoryWebApiModule.forRoot(InMemoryDataService),
    AppRoutingModule
  ],
  declarations: [ AppComponent, DashboardComponent, HeroDetailComponent, HeroesComponent, HeroSearchComponent ],
  providers:    [ HeroService  ],
  bootstrap:    [ AppComponent ]
})


export class AppModule { }
