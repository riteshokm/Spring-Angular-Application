import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { UserDetailsComponent } from 'src/app/components/user-details/user-details.component';
import { CreateUserComponent } from 'src/app/components/create-user/create-user.component';
import { UserListComponent } from 'src/app/components/user-list/user-list.component';
import { UpdateUserComponent } from 'src/app/components/update-user/update-user.component';
import { from } from 'rxjs';

const routes: Routes = [
  { path: '', redirectTo: 'donor', pathMatch: 'full' },
  { path: 'donors', component: UserListComponent },
  { path: 'add', component: CreateUserComponent },
  { path: 'update/:id', component: UpdateUserComponent },
  { path: 'details/:id', component: UserDetailsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
