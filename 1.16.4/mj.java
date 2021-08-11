/*     */ import com.google.common.base.Strings;
/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.Lists;
/*     */ import it.unimi.dsi.fastutil.bytes.ByteOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.bytes.ByteSet;
/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ import java.io.IOException;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class mj
/*     */   extends mc<mt>
/*     */ {
/*  32 */   public static final mv<mj> a = new mv<mj>()
/*     */     {
/*     */       public mj a(DataInput ☃, int i, mm mm1) throws IOException {
/*  35 */         mm1.a(296L);
/*     */         
/*  37 */         if (i > 512) {
/*  38 */           throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
/*     */         }
/*  40 */         byte b = ☃.readByte();
/*  41 */         int j = ☃.readInt();
/*  42 */         if (b == 0 && j > 0) {
/*  43 */           throw new RuntimeException("Missing type on ListTag");
/*     */         }
/*  45 */         mm1.a(32L * j);
/*  46 */         mv<?> mv1 = mw.a(b);
/*  47 */         List<mt> list = Lists.newArrayListWithCapacity(j);
/*  48 */         for (int k = 0; k < j; k++) {
/*  49 */           list.add((mt)mv1.b(☃, i + 1, mm1));
/*     */         }
/*  51 */         return new mj(list, b);
/*     */       }
/*     */ 
/*     */       
/*     */       public String a() {
/*  56 */         return "LIST";
/*     */       }
/*     */ 
/*     */       
/*     */       public String b() {
/*  61 */         return "TAG_List";
/*     */       }
/*     */     };
/*     */ 
/*     */   
/*  66 */   private static final ByteSet b = (ByteSet)new ByteOpenHashSet(Arrays.asList(new Byte[] { Byte.valueOf((byte)1), Byte.valueOf((byte)2), Byte.valueOf((byte)3), Byte.valueOf((byte)4), Byte.valueOf((byte)5), Byte.valueOf((byte)6) }));
/*     */   
/*     */   private final List<mt> c;
/*     */   private byte h;
/*     */   
/*     */   private mj(List<mt> ☃, byte b) {
/*  72 */     this.c = ☃;
/*  73 */     this.h = b;
/*     */   }
/*     */   
/*     */   public mj() {
/*  77 */     this(Lists.newArrayList(), (byte)0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  82 */     if (this.c.isEmpty()) {
/*  83 */       this.h = 0;
/*     */     } else {
/*  85 */       this.h = ((mt)this.c.get(0)).a();
/*     */     } 
/*     */     
/*  88 */     ☃.writeByte(this.h);
/*  89 */     ☃.writeInt(this.c.size());
/*  90 */     for (mt mt : this.c) {
/*  91 */       mt.a(☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  97 */     return 9;
/*     */   }
/*     */ 
/*     */   
/*     */   public mv<mj> b() {
/* 102 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 107 */     StringBuilder ☃ = new StringBuilder("[");
/* 108 */     for (int i = 0; i < this.c.size(); i++) {
/* 109 */       if (i != 0) {
/* 110 */         ☃.append(',');
/*     */       }
/* 112 */       ☃.append(this.c.get(i));
/*     */     } 
/* 114 */     return ☃.append(']').toString();
/*     */   }
/*     */   
/*     */   private void g() {
/* 118 */     if (this.c.isEmpty()) {
/* 119 */       this.h = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public mt c(int ☃) {
/* 125 */     mt mt = this.c.remove(☃);
/* 126 */     g();
/* 127 */     return mt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/* 138 */     return this.c.isEmpty();
/*     */   }
/*     */   
/*     */   public md a(int ☃) {
/* 142 */     if (☃ >= 0 && ☃ < this.c.size()) {
/* 143 */       mt mt = this.c.get(☃);
/* 144 */       if (mt.a() == 10) {
/* 145 */         return (md)mt;
/*     */       }
/*     */     } 
/* 148 */     return new md();
/*     */   }
/*     */   
/*     */   public mj b(int ☃) {
/* 152 */     if (☃ >= 0 && ☃ < this.c.size()) {
/* 153 */       mt mt = this.c.get(☃);
/* 154 */       if (mt.a() == 9) {
/* 155 */         return (mj)mt;
/*     */       }
/*     */     } 
/* 158 */     return new mj();
/*     */   }
/*     */   
/*     */   public short d(int ☃) {
/* 162 */     if (☃ >= 0 && ☃ < this.c.size()) {
/* 163 */       mt mt = this.c.get(☃);
/* 164 */       if (mt.a() == 2) {
/* 165 */         return ((mr)mt).g();
/*     */       }
/*     */     } 
/* 168 */     return 0;
/*     */   }
/*     */   
/*     */   public int e(int ☃) {
/* 172 */     if (☃ >= 0 && ☃ < this.c.size()) {
/* 173 */       mt mt = this.c.get(☃);
/* 174 */       if (mt.a() == 3) {
/* 175 */         return ((mi)mt).f();
/*     */       }
/*     */     } 
/* 178 */     return 0;
/*     */   }
/*     */   
/*     */   public int[] f(int ☃) {
/* 182 */     if (☃ >= 0 && ☃ < this.c.size()) {
/* 183 */       mt mt = this.c.get(☃);
/* 184 */       if (mt.a() == 11) {
/* 185 */         return ((mh)mt).g();
/*     */       }
/*     */     } 
/* 188 */     return new int[0];
/*     */   }
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
/*     */   public double h(int ☃) {
/* 202 */     if (☃ >= 0 && ☃ < this.c.size()) {
/* 203 */       mt mt = this.c.get(☃);
/* 204 */       if (mt.a() == 6) {
/* 205 */         return ((me)mt).i();
/*     */       }
/*     */     } 
/* 208 */     return 0.0D;
/*     */   }
/*     */   
/*     */   public float i(int ☃) {
/* 212 */     if (☃ >= 0 && ☃ < this.c.size()) {
/* 213 */       mt mt = this.c.get(☃);
/* 214 */       if (mt.a() == 5) {
/* 215 */         return ((mg)mt).j();
/*     */       }
/*     */     } 
/* 218 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public String j(int ☃) {
/* 222 */     if (☃ < 0 || ☃ >= this.c.size()) {
/* 223 */       return "";
/*     */     }
/* 225 */     mt mt = this.c.get(☃);
/* 226 */     if (mt.a() == 8) {
/* 227 */       return mt.f_();
/*     */     }
/* 229 */     return mt.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 234 */     return this.c.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public mt k(int ☃) {
/* 239 */     return this.c.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public mt d(int ☃, mt mt1) {
/* 244 */     mt mt2 = k(☃);
/* 245 */     if (!a(☃, mt1)) {
/* 246 */       throw new UnsupportedOperationException(String.format("Trying to add tag of type %d to list of %d", new Object[] { Byte.valueOf(mt1.a()), Byte.valueOf(this.h) }));
/*     */     }
/* 248 */     return mt2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(int ☃, mt mt1) {
/* 253 */     if (!b(☃, mt1)) {
/* 254 */       throw new UnsupportedOperationException(String.format("Trying to add tag of type %d to list of %d", new Object[] { Byte.valueOf(mt1.a()), Byte.valueOf(this.h) }));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, mt mt1) {
/* 260 */     if (a(mt1)) {
/* 261 */       this.c.set(☃, mt1);
/* 262 */       return true;
/*     */     } 
/* 264 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, mt mt1) {
/* 269 */     if (a(mt1)) {
/* 270 */       this.c.add(☃, mt1);
/* 271 */       return true;
/*     */     } 
/* 273 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(mt ☃) {
/* 277 */     if (☃.a() == 0) {
/* 278 */       return false;
/*     */     }
/* 280 */     if (this.h == 0) {
/* 281 */       this.h = ☃.a();
/* 282 */       return true;
/*     */     } 
/* 284 */     return (this.h == ☃.a());
/*     */   }
/*     */ 
/*     */   
/*     */   public mj d() {
/* 289 */     Iterable<mt> ☃ = mw.a(this.h).c() ? this.c : Iterables.transform(this.c, mt::c);
/* 290 */     List<mt> list = Lists.newArrayList(☃);
/* 291 */     return new mj(list, this.h);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 296 */     if (this == ☃) {
/* 297 */       return true;
/*     */     }
/*     */     
/* 300 */     return (☃ instanceof mj && Objects.equals(this.c, ((mj)☃).c));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 305 */     return this.c.hashCode();
/*     */   }
/*     */ 
/*     */   
/*     */   public nr a(String ☃, int i) {
/* 310 */     if (isEmpty()) {
/* 311 */       return new oe("[]");
/*     */     }
/*     */     
/* 314 */     if (b.contains(this.h) && size() <= 8) {
/* 315 */       String str1 = ", ";
/* 316 */       nx nx1 = new oe("[");
/* 317 */       for (int k = 0; k < this.c.size(); k++) {
/* 318 */         if (k != 0) {
/* 319 */           nx1.c(", ");
/*     */         }
/* 321 */         nx1.a(((mt)this.c.get(k)).l());
/*     */       } 
/* 323 */       nx1.c("]");
/* 324 */       return nx1;
/*     */     } 
/*     */     
/* 327 */     nx nx = new oe("[");
/* 328 */     if (!☃.isEmpty()) {
/* 329 */       nx.c("\n");
/*     */     }
/* 331 */     String str = String.valueOf(',');
/* 332 */     for (int j = 0; j < this.c.size(); j++) {
/* 333 */       nx nx1 = new oe(Strings.repeat(☃, i + 1));
/* 334 */       nx1.a(((mt)this.c.get(j)).a(☃, i + 1));
/* 335 */       if (j != this.c.size() - 1) {
/* 336 */         nx1.c(str).c(☃.isEmpty() ? " " : "\n");
/*     */       }
/* 338 */       nx.a(nx1);
/*     */     } 
/* 340 */     if (!☃.isEmpty()) {
/* 341 */       nx.c("\n").c(Strings.repeat(☃, i));
/*     */     }
/* 343 */     nx.c("]");
/*     */     
/* 345 */     return nx;
/*     */   }
/*     */ 
/*     */   
/*     */   public byte d_() {
/* 350 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/* 355 */     this.c.clear();
/* 356 */     this.h = 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\mj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */