/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ import java.io.IOException;
/*     */ import java.util.Objects;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ms
/*     */   implements mt
/*     */ {
/*  19 */   public static final mv<ms> a = new mv<ms>()
/*     */     {
/*     */       public ms a(DataInput ☃, int i, mm mm1) throws IOException {
/*  22 */         mm1.a(288L);
/*     */ 
/*     */         
/*  25 */         String str = ☃.readUTF();
/*  26 */         mm1.a((16 * str.length()));
/*  27 */         return ms.a(str);
/*     */       }
/*     */ 
/*     */       
/*     */       public String a() {
/*  32 */         return "STRING";
/*     */       }
/*     */ 
/*     */       
/*     */       public String b() {
/*  37 */         return "TAG_String";
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean c() {
/*  42 */         return true;
/*     */       }
/*     */     };
/*     */   
/*  46 */   private static final ms b = new ms("");
/*     */   
/*     */   private final String c;
/*     */   
/*     */   private ms(String ☃) {
/*  51 */     Objects.requireNonNull(☃, "Null string not allowed");
/*  52 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public static ms a(String ☃) {
/*  56 */     if (☃.isEmpty()) {
/*  57 */       return b;
/*     */     }
/*  59 */     return new ms(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  64 */     ☃.writeUTF(this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  69 */     return 8;
/*     */   }
/*     */ 
/*     */   
/*     */   public mv<ms> b() {
/*  74 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  79 */     return b(this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public ms d() {
/*  84 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  94 */     if (this == ☃) {
/*  95 */       return true;
/*     */     }
/*     */     
/*  98 */     return (☃ instanceof ms && Objects.equals(this.c, ((ms)☃).c));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 103 */     return this.c.hashCode();
/*     */   }
/*     */ 
/*     */   
/*     */   public String f_() {
/* 108 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public nr a(String ☃, int i) {
/* 113 */     String str1 = b(this.c);
/* 114 */     String str2 = str1.substring(0, 1);
/* 115 */     nr nr = (new oe(str1.substring(1, str1.length() - 1))).a(e);
/* 116 */     return (new oe(str2)).a(nr).c(str2);
/*     */   }
/*     */   
/*     */   public static String b(String ☃) {
/* 120 */     StringBuilder stringBuilder = new StringBuilder(" ");
/* 121 */     char c = Character.MIN_VALUE;
/* 122 */     for (int i = 0; i < ☃.length(); i++) {
/* 123 */       char c1 = ☃.charAt(i);
/* 124 */       if (c1 == '\\') {
/* 125 */         stringBuilder.append('\\');
/* 126 */       } else if (c1 == '"' || c1 == '\'') {
/* 127 */         if (c == '\000') {
/* 128 */           c = (c1 == '"') ? '\'' : '"';
/*     */         }
/* 130 */         if (c == c1) {
/* 131 */           stringBuilder.append('\\');
/*     */         }
/*     */       } 
/* 134 */       stringBuilder.append(c1);
/*     */     } 
/* 136 */     if (c == '\000') {
/* 137 */       c = '"';
/*     */     }
/*     */     
/* 140 */     stringBuilder.setCharAt(0, c);
/* 141 */     stringBuilder.append(c);
/* 142 */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ms.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */