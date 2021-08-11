/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ import java.io.IOException;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import org.apache.commons.lang3.ArrayUtils;
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
/*     */ 
/*     */ public class ma
/*     */   extends mc<mb>
/*     */ {
/*  23 */   public static final mv<ma> a = new mv<ma>()
/*     */     {
/*     */       public ma a(DataInput ☃, int i, mm mm1) throws IOException {
/*  26 */         mm1.a(192L);
/*  27 */         int j = ☃.readInt();
/*  28 */         mm1.a(8L * j);
/*  29 */         byte[] arrayOfByte = new byte[j];
/*  30 */         ☃.readFully(arrayOfByte);
/*  31 */         return new ma(arrayOfByte);
/*     */       }
/*     */ 
/*     */       
/*     */       public String a() {
/*  36 */         return "BYTE[]";
/*     */       }
/*     */ 
/*     */       
/*     */       public String b() {
/*  41 */         return "TAG_Byte_Array";
/*     */       }
/*     */     };
/*     */   
/*     */   private byte[] b;
/*     */   
/*     */   public ma(byte[] ☃) {
/*  48 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public ma(List<Byte> ☃) {
/*  52 */     this(a(☃));
/*     */   }
/*     */   
/*     */   private static byte[] a(List<Byte> ☃) {
/*  56 */     byte[] arrayOfByte = new byte[☃.size()];
/*  57 */     for (int i = 0; i < ☃.size(); i++) {
/*  58 */       Byte byte_ = ☃.get(i);
/*  59 */       arrayOfByte[i] = (byte_ == null) ? 0 : byte_.byteValue();
/*     */     } 
/*     */     
/*  62 */     return arrayOfByte;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  67 */     ☃.writeInt(this.b.length);
/*  68 */     ☃.write(this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  73 */     return 7;
/*     */   }
/*     */ 
/*     */   
/*     */   public mv<ma> b() {
/*  78 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  83 */     StringBuilder ☃ = new StringBuilder("[B;");
/*  84 */     for (int i = 0; i < this.b.length; i++) {
/*  85 */       if (i != 0) {
/*  86 */         ☃.append(',');
/*     */       }
/*  88 */       ☃.append(this.b[i]).append('B');
/*     */     } 
/*  90 */     return ☃.append(']').toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public mt c() {
/*  95 */     byte[] ☃ = new byte[this.b.length];
/*  96 */     System.arraycopy(this.b, 0, ☃, 0, this.b.length);
/*  97 */     return new ma(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 102 */     if (this == ☃) {
/* 103 */       return true;
/*     */     }
/*     */     
/* 106 */     return (☃ instanceof ma && Arrays.equals(this.b, ((ma)☃).b));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 111 */     return Arrays.hashCode(this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public nr a(String ☃, int i) {
/* 116 */     nr nr = (new oe("B")).a(g);
/* 117 */     nx nx = (new oe("[")).a(nr).c(";");
/*     */     
/* 119 */     for (int j = 0; j < this.b.length; j++) {
/* 120 */       nx nx1 = (new oe(String.valueOf(this.b[j]))).a(f);
/*     */       
/* 122 */       nx.c(" ").a(nx1).a(nr);
/*     */       
/* 124 */       if (j != this.b.length - 1) {
/* 125 */         nx.c(",");
/*     */       }
/*     */     } 
/*     */     
/* 129 */     nx.c("]");
/*     */     
/* 131 */     return nx;
/*     */   }
/*     */   
/*     */   public byte[] d() {
/* 135 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 140 */     return this.b.length;
/*     */   }
/*     */ 
/*     */   
/*     */   public mb a(int ☃) {
/* 145 */     return mb.a(this.b[☃]);
/*     */   }
/*     */ 
/*     */   
/*     */   public mb a(int ☃, mb mb1) {
/* 150 */     byte b = this.b[☃];
/* 151 */     this.b[☃] = mb1.h();
/* 152 */     return mb.a(b);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int ☃, mb mb1) {
/* 157 */     this.b = ArrayUtils.add(this.b, ☃, mb1.h());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, mt mt1) {
/* 162 */     if (mt1 instanceof mq) {
/* 163 */       this.b[☃] = ((mq)mt1).h();
/* 164 */       return true;
/*     */     } 
/* 166 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, mt mt1) {
/* 171 */     if (mt1 instanceof mq) {
/* 172 */       this.b = ArrayUtils.add(this.b, ☃, ((mq)mt1).h());
/* 173 */       return true;
/*     */     } 
/* 175 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public mb b(int ☃) {
/* 180 */     byte b = this.b[☃];
/* 181 */     this.b = ArrayUtils.remove(this.b, ☃);
/* 182 */     return mb.a(b);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte d_() {
/* 187 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/* 192 */     this.b = new byte[0];
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ma.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */