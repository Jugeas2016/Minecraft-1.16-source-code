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
/*     */ public class mh
/*     */   extends mc<mi>
/*     */ {
/*  23 */   public static final mv<mh> a = new mv<mh>()
/*     */     {
/*     */       public mh a(DataInput ☃, int i, mm mm1) throws IOException {
/*  26 */         mm1.a(192L);
/*     */         
/*  28 */         int j = ☃.readInt();
/*  29 */         mm1.a(32L * j);
/*  30 */         int[] arrayOfInt = new int[j];
/*  31 */         for (int k = 0; k < j; k++) {
/*  32 */           arrayOfInt[k] = ☃.readInt();
/*     */         }
/*  34 */         return new mh(arrayOfInt);
/*     */       }
/*     */ 
/*     */       
/*     */       public String a() {
/*  39 */         return "INT[]";
/*     */       }
/*     */ 
/*     */       
/*     */       public String b() {
/*  44 */         return "TAG_Int_Array";
/*     */       }
/*     */     };
/*     */   
/*     */   private int[] b;
/*     */   
/*     */   public mh(int[] ☃) {
/*  51 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public mh(List<Integer> ☃) {
/*  55 */     this(a(☃));
/*     */   }
/*     */   
/*     */   private static int[] a(List<Integer> ☃) {
/*  59 */     int[] arrayOfInt = new int[☃.size()];
/*  60 */     for (int i = 0; i < ☃.size(); i++) {
/*  61 */       Integer integer = ☃.get(i);
/*  62 */       arrayOfInt[i] = (integer == null) ? 0 : integer.intValue();
/*     */     } 
/*     */     
/*  65 */     return arrayOfInt;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  70 */     ☃.writeInt(this.b.length);
/*  71 */     for (int i : this.b) {
/*  72 */       ☃.writeInt(i);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  78 */     return 11;
/*     */   }
/*     */ 
/*     */   
/*     */   public mv<mh> b() {
/*  83 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  88 */     StringBuilder ☃ = new StringBuilder("[I;");
/*  89 */     for (int i = 0; i < this.b.length; i++) {
/*  90 */       if (i != 0) {
/*  91 */         ☃.append(',');
/*     */       }
/*  93 */       ☃.append(this.b[i]);
/*     */     } 
/*  95 */     return ☃.append(']').toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public mh d() {
/* 100 */     int[] ☃ = new int[this.b.length];
/* 101 */     System.arraycopy(this.b, 0, ☃, 0, this.b.length);
/* 102 */     return new mh(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 107 */     if (this == ☃) {
/* 108 */       return true;
/*     */     }
/*     */     
/* 111 */     return (☃ instanceof mh && Arrays.equals(this.b, ((mh)☃).b));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 116 */     return Arrays.hashCode(this.b);
/*     */   }
/*     */   
/*     */   public int[] g() {
/* 120 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public nr a(String ☃, int i) {
/* 125 */     nr nr = (new oe("I")).a(g);
/* 126 */     nx nx = (new oe("[")).a(nr).c(";");
/*     */     
/* 128 */     for (int j = 0; j < this.b.length; j++) {
/* 129 */       nx.c(" ").a((new oe(String.valueOf(this.b[j]))).a(f));
/* 130 */       if (j != this.b.length - 1) {
/* 131 */         nx.c(",");
/*     */       }
/*     */     } 
/*     */     
/* 135 */     nx.c("]");
/*     */     
/* 137 */     return nx;
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 142 */     return this.b.length;
/*     */   }
/*     */ 
/*     */   
/*     */   public mi a(int ☃) {
/* 147 */     return mi.a(this.b[☃]);
/*     */   }
/*     */ 
/*     */   
/*     */   public mi a(int ☃, mi mi1) {
/* 152 */     int i = this.b[☃];
/* 153 */     this.b[☃] = mi1.f();
/* 154 */     return mi.a(i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int ☃, mi mi1) {
/* 159 */     this.b = ArrayUtils.add(this.b, ☃, mi1.f());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, mt mt1) {
/* 164 */     if (mt1 instanceof mq) {
/* 165 */       this.b[☃] = ((mq)mt1).f();
/* 166 */       return true;
/*     */     } 
/* 168 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, mt mt1) {
/* 173 */     if (mt1 instanceof mq) {
/* 174 */       this.b = ArrayUtils.add(this.b, ☃, ((mq)mt1).f());
/* 175 */       return true;
/*     */     } 
/* 177 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public mi b(int ☃) {
/* 182 */     int i = this.b[☃];
/* 183 */     this.b = ArrayUtils.remove(this.b, ☃);
/* 184 */     return mi.a(i);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte d_() {
/* 189 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/* 194 */     this.b = new int[0];
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\mh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */