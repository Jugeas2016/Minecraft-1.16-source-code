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
/*     */ public class mb
/*     */   extends mq
/*     */ {
/*     */   static class a
/*     */   {
/*  19 */     private static final mb[] a = new mb[256];
/*     */     
/*     */     static {
/*  22 */       for (int ☃ = 0; ☃ < a.length; ☃++)
/*  23 */         a[☃] = new mb((byte)(☃ - 128)); 
/*     */     }
/*     */   }
/*     */   
/*  27 */   public static final mv<mb> a = new mv<mb>()
/*     */     {
/*     */       public mb a(DataInput ☃, int i, mm mm1) throws IOException {
/*  30 */         mm1.a(72L);
/*  31 */         return mb.a(☃.readByte());
/*     */       }
/*     */ 
/*     */       
/*     */       public String a() {
/*  36 */         return "BYTE";
/*     */       }
/*     */ 
/*     */       
/*     */       public String b() {
/*  41 */         return "TAG_Byte";
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean c() {
/*  46 */         return true;
/*     */       }
/*     */     };
/*     */   
/*  50 */   public static final mb b = a((byte)0);
/*  51 */   public static final mb c = a((byte)1);
/*     */   
/*     */   private final byte h;
/*     */   
/*     */   private mb(byte ☃) {
/*  56 */     this.h = ☃;
/*     */   }
/*     */   
/*     */   public static mb a(byte ☃) {
/*  60 */     return a.a()[128 + ☃];
/*     */   }
/*     */   
/*     */   public static mb a(boolean ☃) {
/*  64 */     return ☃ ? c : b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  69 */     ☃.writeByte(this.h);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  74 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public mv<mb> b() {
/*  79 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  84 */     return this.h + "b";
/*     */   }
/*     */ 
/*     */   
/*     */   public mb d() {
/*  89 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  94 */     if (this == ☃) {
/*  95 */       return true;
/*     */     }
/*     */     
/*  98 */     return (☃ instanceof mb && this.h == ((mb)☃).h);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 103 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public nr a(String ☃, int i) {
/* 108 */     nr nr = (new oe("b")).a(g);
/* 109 */     return (new oe(String.valueOf(this.h))).a(nr).a(f);
/*     */   }
/*     */ 
/*     */   
/*     */   public long e() {
/* 114 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 119 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public short g() {
/* 124 */     return (short)this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public byte h() {
/* 129 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public double i() {
/* 134 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public float j() {
/* 139 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public Number k() {
/* 144 */     return Byte.valueOf(this.h);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\mb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */