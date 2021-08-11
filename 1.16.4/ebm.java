/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import java.lang.reflect.Type;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ebm
/*     */ {
/*  12 */   public static final ebm a = new ebm();
/*     */   
/*     */   public final ebl b;
/*     */   public final ebl c;
/*     */   public final ebl d;
/*     */   public final ebl e;
/*     */   public final ebl f;
/*     */   public final ebl g;
/*     */   public final ebl h;
/*     */   public final ebl i;
/*     */   
/*     */   private ebm() {
/*  24 */     this(ebl.a, ebl.a, ebl.a, ebl.a, ebl.a, ebl.a, ebl.a, ebl.a);
/*     */   }
/*     */   
/*     */   public ebm(ebm ☃) {
/*  28 */     this.b = ☃.b;
/*  29 */     this.c = ☃.c;
/*  30 */     this.d = ☃.d;
/*  31 */     this.e = ☃.e;
/*  32 */     this.f = ☃.f;
/*  33 */     this.g = ☃.g;
/*  34 */     this.h = ☃.h;
/*  35 */     this.i = ☃.i;
/*     */   }
/*     */   
/*     */   public ebm(ebl ☃, ebl ebl1, ebl ebl2, ebl ebl3, ebl ebl4, ebl ebl5, ebl ebl6, ebl ebl7) {
/*  39 */     this.b = ☃;
/*  40 */     this.c = ebl1;
/*  41 */     this.d = ebl2;
/*  42 */     this.e = ebl3;
/*  43 */     this.f = ebl4;
/*  44 */     this.g = ebl5;
/*  45 */     this.h = ebl6;
/*  46 */     this.i = ebl7;
/*     */   }
/*     */   
/*     */   public ebl a(b ☃) {
/*  50 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/*  52 */         return this.b;
/*     */       case 2:
/*  54 */         return this.c;
/*     */       case 3:
/*  56 */         return this.d;
/*     */       case 4:
/*  58 */         return this.e;
/*     */       case 5:
/*  60 */         return this.f;
/*     */       case 6:
/*  62 */         return this.g;
/*     */       case 7:
/*  64 */         return this.h;
/*     */       case 8:
/*  66 */         return this.i;
/*     */     } 
/*  68 */     return ebl.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(b ☃) {
/*  73 */     return (a(☃) != ebl.a);
/*     */   }
/*     */   
/*     */   public enum b {
/*  77 */     a,
/*  78 */     b,
/*  79 */     c,
/*  80 */     d,
/*  81 */     e,
/*  82 */     f,
/*  83 */     g,
/*  84 */     h,
/*  85 */     i;
/*     */ 
/*     */     
/*     */     public boolean a() {
/*  89 */       return (this == d || this == e);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements JsonDeserializer<ebm> {
/*     */     public ebm a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*  96 */       JsonObject jsonObject = ☃.getAsJsonObject();
/*     */       
/*  98 */       ebl ebl1 = a(jsonDeserializationContext, jsonObject, "thirdperson_righthand");
/*  99 */       ebl ebl2 = a(jsonDeserializationContext, jsonObject, "thirdperson_lefthand");
/* 100 */       if (ebl2 == ebl.a) {
/* 101 */         ebl2 = ebl1;
/*     */       }
/* 103 */       ebl ebl3 = a(jsonDeserializationContext, jsonObject, "firstperson_righthand");
/* 104 */       ebl ebl4 = a(jsonDeserializationContext, jsonObject, "firstperson_lefthand");
/* 105 */       if (ebl4 == ebl.a) {
/* 106 */         ebl4 = ebl3;
/*     */       }
/* 108 */       ebl ebl5 = a(jsonDeserializationContext, jsonObject, "head");
/* 109 */       ebl ebl6 = a(jsonDeserializationContext, jsonObject, "gui");
/* 110 */       ebl ebl7 = a(jsonDeserializationContext, jsonObject, "ground");
/* 111 */       ebl ebl8 = a(jsonDeserializationContext, jsonObject, "fixed");
/*     */       
/* 113 */       return new ebm(ebl2, ebl1, ebl4, ebl3, ebl5, ebl6, ebl7, ebl8);
/*     */     }
/*     */     
/*     */     private ebl a(JsonDeserializationContext ☃, JsonObject jsonObject, String str) {
/* 117 */       if (jsonObject.has(str)) {
/* 118 */         return (ebl)☃.deserialize(jsonObject.get(str), ebl.class);
/*     */       }
/* 120 */       return ebl.a;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */