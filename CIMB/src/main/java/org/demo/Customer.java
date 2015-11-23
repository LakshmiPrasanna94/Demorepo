package org.demo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Customer implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Integer id;
   private java.lang.String name;
   private java.lang.Integer age;
   private java.lang.String address;
   private java.lang.Integer mobilenum;
   private java.lang.Boolean female;
   private java.lang.Boolean male;
   private java.lang.Boolean newloan;
   private java.lang.Boolean existingloan;
   private java.lang.Boolean personal;
   private java.lang.Boolean strategic;
   private java.lang.Boolean corporate;

   private java.lang.Integer loanamount;

   private java.lang.Integer durationofloan;

   private java.lang.String reasonforloan;

   private java.lang.Integer interestrate;

   private java.lang.String remarks;

   private java.lang.Boolean approve;

   private boolean cancel;

   private java.lang.Boolean rework;

   private java.lang.Boolean reject;

   private java.lang.Boolean other1;

   private java.lang.Boolean other2;

   public Customer()
   {
   }

   public java.lang.Integer getId()
   {
      return this.id;
   }

   public void setId(java.lang.Integer id)
   {
      this.id = id;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
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

   public java.lang.Integer getMobilenum()
   {
      return this.mobilenum;
   }

   public void setMobilenum(java.lang.Integer mobilenum)
   {
      this.mobilenum = mobilenum;
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

   public java.lang.Boolean getNewloan()
   {
      return this.newloan;
   }

   public void setNewloan(java.lang.Boolean newloan)
   {
      this.newloan = newloan;
   }

   public java.lang.Boolean getExistingloan()
   {
      return this.existingloan;
   }

   public void setExistingloan(java.lang.Boolean existingloan)
   {
      this.existingloan = existingloan;
   }

   public java.lang.Boolean getPersonal()
   {
      return this.personal;
   }

   public void setPersonal(java.lang.Boolean personal)
   {
      this.personal = personal;
   }

   public java.lang.Boolean getStrategic()
   {
      return this.strategic;
   }

   public void setStrategic(java.lang.Boolean strategic)
   {
      this.strategic = strategic;
   }

   public java.lang.Boolean getCorporate()
   {
      return this.corporate;
   }

   public void setCorporate(java.lang.Boolean corporate)
   {
      this.corporate = corporate;
   }

   public java.lang.Integer getLoanamount()
   {
      return this.loanamount;
   }

   public void setLoanamount(java.lang.Integer loanamount)
   {
      this.loanamount = loanamount;
   }

   public java.lang.Integer getDurationofloan()
   {
      return this.durationofloan;
   }

   public void setDurationofloan(java.lang.Integer durationofloan)
   {
      this.durationofloan = durationofloan;
   }

   public java.lang.String getReasonforloan()
   {
      return this.reasonforloan;
   }

   public void setReasonforloan(java.lang.String reasonforloan)
   {
      this.reasonforloan = reasonforloan;
   }

   public java.lang.Integer getInterestrate()
   {
      return this.interestrate;
   }

   public void setInterestrate(java.lang.Integer interestrate)
   {
      this.interestrate = interestrate;
   }

   public java.lang.String getRemarks()
   {
      return this.remarks;
   }

   public void setRemarks(java.lang.String remarks)
   {
      this.remarks = remarks;
   }

   public java.lang.Boolean getApprove()
   {
      return this.approve;
   }

   public void setApprove(java.lang.Boolean approve)
   {
      this.approve = approve;
   }

   public boolean isCancel()
   {
      return this.cancel;
   }

   public void setCancel(boolean cancel)
   {
      this.cancel = cancel;
   }

   public java.lang.Boolean getRework()
   {
      return this.rework;
   }

   public void setRework(java.lang.Boolean rework)
   {
      this.rework = rework;
   }

   public java.lang.Boolean getReject()
   {
      return this.reject;
   }

   public void setReject(java.lang.Boolean reject)
   {
      this.reject = reject;
   }

   public java.lang.Boolean getOther1()
   {
      return this.other1;
   }

   public void setOther1(java.lang.Boolean other1)
   {
      this.other1 = other1;
   }

   public java.lang.Boolean getOther2()
   {
      return this.other2;
   }

   public void setOther2(java.lang.Boolean other2)
   {
      this.other2 = other2;
   }

   public Customer(java.lang.Integer id, java.lang.String name,
         java.lang.Integer age, java.lang.String address,
         java.lang.Integer mobilenum, java.lang.Boolean female,
         java.lang.Boolean male, java.lang.Boolean newloan,
         java.lang.Boolean existingloan, java.lang.Boolean personal,
         java.lang.Boolean strategic, java.lang.Boolean corporate,
         java.lang.Integer loanamount, java.lang.Integer durationofloan,
         java.lang.String reasonforloan, java.lang.Integer interestrate,
         java.lang.String remarks, java.lang.Boolean approve, boolean cancel,
         java.lang.Boolean rework, java.lang.Boolean reject,
         java.lang.Boolean other1, java.lang.Boolean other2)
   {
      this.id = id;
      this.name = name;
      this.age = age;
      this.address = address;
      this.mobilenum = mobilenum;
      this.female = female;
      this.male = male;
      this.newloan = newloan;
      this.existingloan = existingloan;
      this.personal = personal;
      this.strategic = strategic;
      this.corporate = corporate;
      this.loanamount = loanamount;
      this.durationofloan = durationofloan;
      this.reasonforloan = reasonforloan;
      this.interestrate = interestrate;
      this.remarks = remarks;
      this.approve = approve;
      this.cancel = cancel;
      this.rework = rework;
      this.reject = reject;
      this.other1 = other1;
      this.other2 = other2;
   }

}