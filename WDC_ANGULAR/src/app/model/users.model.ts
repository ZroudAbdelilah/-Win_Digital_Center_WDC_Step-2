import { Role } from './role.model';
export class Users {
  userId: number;
  email: string;
  firstName: string;
  lastName: string;
  password?: string;
  phoneNumber?: string;
  status?: string;
  role?: Role;
}
