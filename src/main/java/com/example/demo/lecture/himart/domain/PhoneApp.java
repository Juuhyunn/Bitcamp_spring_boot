package com.example.demo.lecture.himart.domain;

import lombok.Data;

//바깥쪽 클래스는 public해야함
public class PhoneApp {
    @Data public class Phone {         //@Data로 getter setter 생략가능
        protected String kind, company,call;
        @Override public String toString() {
            return "집 전화기{" +
                    "폰 종류='" + kind + '\'' +
                    ", 제조사='" + company + '\'' +
                    ", 통화='" + call + '\'' +
                    '}';
        }
    }
    @Data public class CelPhone extends Phone{
        protected boolean portable;
        protected String move;
        @Override public String toString() {
            return "휴대 전화기{" +
                    "폰 종류='" + kind + '\'' +
                    ", 제조사='" + company + '\'' +
                    ", 이동='" + move + '\'' +
                    ", 통화='" + call + '\'' +
                    '}';
        }
    }
    @Data public class IPhone extends CelPhone{
        public static final String BRAND = "아이폰";
        protected String internet;
        @Override public String toString() {
            return "스마트폰{" +
                    "폰 종류='" + kind + '\'' +
                    ", 제조사='" + company + '\'' +
                    ", 이동='" + move + '\'' +
                    ", 통화='" + call + '\'' +
                    ", 검색='" + internet + '\'' +
                    '}';
        }
    }
    @Data public class GalaxyNote extends IPhone{
        public static final String BRAND = "갤럭시";
        protected String pencil;
        @Override public String toString() {
            return "스마트폰{" +
                    "폰 종류='" + kind + '\'' +
                    ", 제조사='" + company + '\'' +
                    ", 이동='" + move + '\'' +
                    ", 통화='" + call + '\'' +
                    ", 검색='" + internet + '\'' +
                    ", 펜슬='" + pencil + '\'' +
                    '}';
        }
    }
}