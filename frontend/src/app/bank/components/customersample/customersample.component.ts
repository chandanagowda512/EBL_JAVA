import { Component } from '@angular/core';
// import { FormBuilder, FormGroup, Validators } from '@angular/forms';
// import { of } from 'rxjs';
import { CustomerTS } from '../../types/tstypes/Customerts';
 
@Component({
  selector: 'app-customersample',
  standalone: true,
  imports: [],
  templateUrl: './customersample.component.html',
  styleUrls: ['./customersample.component.css']
})
export class CustomersampleComponent {
  // customer: CustomerTS;
 
 
    customer:CustomerTS = new CustomerTS("John Doe", "john@example.com", "john_doe", "password123", "User", "1");
 
 
 
 
}