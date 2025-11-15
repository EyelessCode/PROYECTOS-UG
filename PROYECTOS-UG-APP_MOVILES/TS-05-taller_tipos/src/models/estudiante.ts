export default class Student{
    private ci:string
    private name:string
    private lastname:string
    private age:number
    private email:string
    private isActive:boolean=false;

    constructor(ci:string,name:string,lastname:string,age:number,email:string){
        this.ci=ci,
        this.name=name,
        this.lastname=lastname,
        this.age=age,
        this.email=email,
        this.isActive=true
    }

    get getCi():string{
        return this.ci;
    }

    get getName():string{
        return this.name;
    }

    get getLastname():string{
        return this.lastname;
    }

    get getAge():number{
        return this.age;
    }

    get getIsActive():boolean{
        return this.isActive;
    }

    get getEmail():string{
        return this.email;
    }
}
