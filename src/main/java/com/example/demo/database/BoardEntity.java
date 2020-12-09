package com.example.demo.database;

import java.io.Serializable;

import javax.persistence.*;
import lombok.*;



    @Entity
    @Table(name = "employee")
    @Getter
    @Setter
    @Data
    public class BoardEntity implements Serializable {
	
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column
        private long no;
        private String name;
        private String id;
        private String password;
        private String hp;
        private String email;
        private String birth;
        private String address;
        private String sex;
        private String rank;
        private int salary;
        private String profile_name;
        private int profile_size;
        private int verify;
        private String regidate;
        private String department;
        private String branch;

        public String getDepartment() {
            return this.department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getBranch() {
            return this.branch;
        }

        public void setBranch(String branch) {
            this.branch = branch;
        }


        public String getAddress() {
            return this.address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
        
        public String getHp() {
            return this.hp;
        }
        
        public void setHp(String hp) {
            this.hp = hp;
        }

        public String getEmail() {
            return this.email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getBirth() {
            return this.birth;
        }

        public void setBirth(String birth) {
            this.birth = birth;
        }

        public String getSex() {
            return this.sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getRank() {
            return this.rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public int getSalary() {
            return this.salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public String getProfile_name() {
            return this.profile_name;
        }

        public void setProfile_name(String profile_name) {
            this.profile_name = profile_name;
        }

        public int getProfile_size() {
            return this.profile_size;
        }

        public void setProfile_size(int profile_size) {
            this.profile_size = profile_size;
        }

        public int getVerify() {
            return this.verify;
        }

        public void setVerify(int verify) {
            this.verify = verify;
        }

        public String getRegidate() {
            return this.regidate;
        }

        public void setRegidate(String regidate) {
            this.regidate = regidate;
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPassword() {
            return this.password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public long getNo(){
            return no;
        }

        public String getName(){
            return name;
        }
        
    }

