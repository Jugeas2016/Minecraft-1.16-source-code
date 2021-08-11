/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ import java.io.IOException;
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
/*     */ 
/*     */ public class mr
/*     */   extends mq
/*     */ {
/*     */   static class a
/*     */   {
/*  21 */     static final mr[] a = new mr[1153];
/*     */     
/*     */     static {
/*  24 */       for (int ☃ = 0; ☃ < a.length; ☃++)
/*  25 */         a[☃] = new mr((short)(-128 + ☃)); 
/*     */     }
/*     */   }
/*     */   
/*  29 */   public static final mv<mr> a = new mv<mr>()
/*     */     {
/*     */       public mr a(DataInput ☃, int i, mm mm1) throws IOException {
/*  32 */         mm1.a(80L);
/*  33 */         return mr.a(☃.readShort());
/*     */       }
/*     */ 
/*     */       
/*     */       public String a() {
/*  38 */         return "SHORT";
/*     */       }
/*     */ 
/*     */       
/*     */       public String b() {
/*  43 */         return "TAG_Short";
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean c() {
/*  48 */         return true;
/*     */       }
/*     */     };
/*     */   
/*     */   private final short b;
/*     */   
/*     */   private mr(short ☃) {
/*  55 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public static mr a(short ☃) {
/*  59 */     if (☃ >= -128 && ☃ <= 1024)
/*  60 */       return a.a[☃ + 128]; 
/*  61 */     return new mr(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  66 */     ☃.writeShort(this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  71 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public mv<mr> b() {
/*  76 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  81 */     return this.b + "s";
/*     */   }
/*     */ 
/*     */   
/*     */   public mr d() {
/*  86 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  91 */     if (this == ☃) {
/*  92 */       return true;
/*     */     }
/*     */     
/*  95 */     return (☃ instanceof mr && this.b == ((mr)☃).b);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 100 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public nr a(String ☃, int i) {
/* 105 */     nr nr = (new oe("s")).a(g);
/* 106 */     return (new oe(String.valueOf(this.b))).a(nr).a(f);
/*     */   }
/*     */ 
/*     */   
/*     */   public long e() {
/* 111 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 116 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public short g() {
/* 121 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public byte h() {
/* 126 */     return (byte)(this.b & 0xFF);
/*     */   }
/*     */ 
/*     */   
/*     */   public double i() {
/* 131 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public float j() {
/* 136 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public Number k() {
/* 141 */     return Short.valueOf(this.b);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\mr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */