import {Component, OnInit} from '@angular/core';
import {Client} from '../models/Client';
import {PageClient} from '../models/PageClient'
import {ClientService} from '../services/client.service';

@Component({
  selector: 'app-clients',
  templateUrl: './clients.component.html',
  styleUrls: ['./clients.component.css']
})
export class ClientsComponent implements OnInit {

  clients: Client[];
  pageClient: PageClient;
  selectedPage: number = 0;

  getClient(): void {
    this.clientService.getClient()
      .subscribe(clients => this.clients = clients);
  }

  getPageClient(page: number): void {
    this.clientService.getPageClient(page)
      .subscribe(page => this.pageClient = page)

  }

  constructor(private clientService: ClientService) {

  }

  onSelect(page: number): void {
    console.log("selected page : " + page);
    this.selectedPage = page;
    this.getPageClient(page);
  }

  ngOnInit() {
    this.getPageClient(0);
  }

}
