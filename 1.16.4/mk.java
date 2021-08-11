/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
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
/*     */ public class mk
/*     */   extends mc<ml>
/*     */ {
/*  24 */   public static final mv<mk> a = new mv<mk>()
/*     */     {
/*     */       public mk a(DataInput ☃, int i, mm mm1) throws IOException {
/*  27 */         mm1.a(192L);
/*     */         
/*  29 */         int j = ☃.readInt();
/*  30 */         mm1.a(64L * j);
/*  31 */         long[] arrayOfLong = new long[j];
/*  32 */         for (int k = 0; k < j; k++) {
/*  33 */           arrayOfLong[k] = ☃.readLong();
/*     */         }
/*  35 */         return new mk(arrayOfLong);
/*     */       }
/*     */ 
/*     */       
/*     */       public String a() {
/*  40 */         return "LONG[]";
/*     */       }
/*     */ 
/*     */       
/*     */       public String b() {
/*  45 */         return "TAG_Long_Array";
/*     */       }
/*     */     };
/*     */   
/*     */   private long[] b;
/*     */   
/*     */   public mk(long[] ☃) {
/*  52 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public mk(LongSet ☃) {
/*  56 */     this.b = ☃.toLongArray();
/*     */   }
/*     */   
/*     */   public mk(List<Long> ☃) {
/*  60 */     this(a(☃));
/*     */   }
/*     */   
/*     */   private static long[] a(List<Long> ☃) {
/*  64 */     long[] arrayOfLong = new long[☃.size()];
/*  65 */     for (int i = 0; i < ☃.size(); i++) {
/*  66 */       Long long_ = ☃.get(i);
/*  67 */       arrayOfLong[i] = (long_ == null) ? 0L : long_.longValue();
/*     */     } 
/*     */     
/*  70 */     return arrayOfLong;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  75 */     ☃.writeInt(this.b.length);
/*  76 */     for (long l : this.b) {
/*  77 */       ☃.writeLong(l);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  83 */     return 12;
/*     */   }
/*     */ 
/*     */   
/*     */   public mv<mk> b() {
/*  88 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  93 */     StringBuilder ☃ = new StringBuilder("[L;");
/*  94 */     for (int i = 0; i < this.b.length; i++) {
/*  95 */       if (i != 0) {
/*  96 */         ☃.append(',');
/*     */       }
/*  98 */       ☃.append(this.b[i]).append('L');
/*     */     } 
/* 100 */     return ☃.append(']').toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public mk d() {
/* 105 */     long[] ☃ = new long[this.b.length];
/* 106 */     System.arraycopy(this.b, 0, ☃, 0, this.b.length);
/* 107 */     return new mk(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 112 */     if (this == ☃) {
/* 113 */       return true;
/*     */     }
/*     */     
/* 116 */     return (☃ instanceof mk && Arrays.equals(this.b, ((mk)☃).b));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 121 */     return Arrays.hashCode(this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public nr a(String ☃, int i) {
/* 126 */     nr nr = (new oe("L")).a(g);
/* 127 */     nx nx = (new oe("[")).a(nr).c(";");
/*     */     
/* 129 */     for (int j = 0; j < this.b.length; j++) {
/* 130 */       nx nx1 = (new oe(String.valueOf(this.b[j]))).a(f);
/* 131 */       nx.c(" ").a(nx1).a(nr);
/* 132 */       if (j != this.b.length - 1) {
/* 133 */         nx.c(",");
/*     */       }
/*     */     } 
/*     */     
/* 137 */     nx.c("]");
/*     */     
/* 139 */     return nx;
/*     */   }
/*     */   
/*     */   public long[] g() {
/* 143 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 148 */     return this.b.length;
/*     */   }
/*     */ 
/*     */   
/*     */   public ml a(int ☃) {
/* 153 */     return ml.a(this.b[☃]);
/*     */   }
/*     */ 
/*     */   
/*     */   public ml a(int ☃, ml ml1) {
/* 158 */     long l = this.b[☃];
/* 159 */     this.b[☃] = ml1.e();
/* 160 */     return ml.a(l);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int ☃, ml ml1) {
/* 165 */     this.b = ArrayUtils.add(this.b, ☃, ml1.e());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, mt mt1) {
/* 170 */     if (mt1 instanceof mq) {
/* 171 */       this.b[☃] = ((mq)mt1).e();
/* 172 */       return true;
/*     */     } 
/* 174 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, mt mt1) {
/* 179 */     if (mt1 instanceof mq) {
/* 180 */       this.b = ArrayUtils.add(this.b, ☃, ((mq)mt1).e());
/* 181 */       return true;
/*     */     } 
/* 183 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public ml b(int ☃) {
/* 188 */     long l = this.b[☃];
/* 189 */     this.b = ArrayUtils.remove(this.b, ☃);
/* 190 */     return ml.a(l);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte d_() {
/* 195 */     return 4;
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/* 200 */     this.b = new long[0];
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\mk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */