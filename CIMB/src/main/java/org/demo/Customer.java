package org.demo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Customer implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Integer custid;

   private java.lang.String custname;

   private java.lang.Integer age;

   private java.lang.String address;

   private java.lang.Integer mnumber;

   private java.lang.Boolean female;

   private java.lang.Boolean male;

   public Customer()
   {
   }

   public java.lang.Integer getCustid()
   {
      return this.custid;
   }

   public void setCustid(java.lang.Integer custid)
   {
      this.custid = custid;
   }

   public java.lang.String getCustname()
   {
      return this.custname;
   }

   public void setCustname(java.lang.String custname)
   {
      this.custname = custname;
   }

   public java.lang.Integer getAge()
   {
      return this.age;
   }

   public void setAge(java.lang.Integer age)
   {
      this.age = age;
   }

   public java.lang.String getAddress()
   {
      return this.address;
   }

   public void setAddress(java.lang.String address)
   {
      this.address = address;
   }

   public java.lang.Integer getMnumber()
   {
      return this.mnumber;
   }

   public void setMnumber(java.lang.Integer mnumber)
   {
      this.mnumber = mnumber;
   }

   public java.lang.Boolean getFemale()
   {
      return this.female;
   }

   public void setFemale(java.lang.Boolean female)
   {
      this.female = female;
   }

   public java.lang.Boolean getMale()
   {
      return this.male;
   }

   public void setMale(java.lang.Boolean male)
   {
      this.male = male;
   }

   public Customer(java.lang.Integer custid, java.lang.String custname,
         java.lang.Integer age, java.lang.String address,
         java.lang.Integer mnumber, java.lang.Boolean female,
         java.lang.Boolean male)
   {
      this.custid = custid;
      this.custname = custname;
      this.age = age;
      this.address = address;
      this.mnumber = mnumber;
      this.female = female;
      this.male = male;
   }

}