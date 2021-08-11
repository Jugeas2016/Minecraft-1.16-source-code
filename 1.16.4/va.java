/*     */ import com.google.common.collect.Lists;
/*     */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*     */ import it.unimi.dsi.fastutil.ints.IntList;
/*     */ import it.unimi.dsi.fastutil.ints.IntListIterator;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class va<C extends aon>
/*     */   implements uz<Integer>
/*     */ {
/*  25 */   protected static final Logger a = LogManager.getLogger();
/*     */   
/*  27 */   protected final bfy b = new bfy();
/*     */   
/*     */   protected bfv c;
/*     */   protected bjj<C> d;
/*     */   
/*     */   public va(bjj<C> ☃) {
/*  33 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public void a(aah ☃, @Nullable boq<C> boq1, boolean bool) {
/*  37 */     if (boq1 == null || !☃.B().b(boq1)) {
/*     */       return;
/*     */     }
/*     */     
/*  41 */     this.c = ☃.bm;
/*     */ 
/*     */     
/*  44 */     if (!b() && !☃.b_()) {
/*     */       return;
/*     */     }
/*     */     
/*  48 */     this.b.a();
/*  49 */     ☃.bm.a(this.b);
/*  50 */     this.d.a(this.b);
/*     */     
/*  52 */     if (this.b.a(boq1, (IntList)null)) {
/*  53 */       a(boq1, bool);
/*     */     } else {
/*  55 */       a();
/*  56 */       ☃.b.a(new qf(☃.bp.b, boq1));
/*     */     } 
/*     */     
/*  59 */     ☃.bm.X_();
/*     */   }
/*     */   
/*     */   protected void a() {
/*  63 */     for (int ☃ = 0; ☃ < this.d.g() * this.d.h() + 1; ☃++) {
/*  64 */       if (☃ != this.d.f() || (!(this.d instanceof bip) && !(this.d instanceof biz)))
/*     */       {
/*     */         
/*  67 */         a(☃);
/*     */       }
/*     */     } 
/*  70 */     this.d.e();
/*     */   }
/*     */   
/*     */   protected void a(int ☃) {
/*  74 */     bmb bmb = this.d.a(☃).e();
/*  75 */     if (bmb.a()) {
/*     */       return;
/*     */     }
/*     */     
/*  79 */     while (bmb.E() > 0) {
/*  80 */       int i = this.c.d(bmb);
/*  81 */       if (i == -1) {
/*  82 */         i = this.c.h();
/*     */       }
/*  84 */       bmb bmb1 = bmb.i();
/*  85 */       bmb1.e(1);
/*     */       
/*  87 */       if (!this.c.c(i, bmb1)) {
/*  88 */         a.error("Can't find any space for item in the inventory");
/*     */       }
/*     */       
/*  91 */       this.d.a(☃).a(1);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(boq<C> ☃, boolean bool) {
/*  96 */     boolean bool1 = this.d.a(☃);
/*  97 */     int i = this.b.b(☃, (IntList)null);
/*     */ 
/*     */     
/* 100 */     if (bool1) {
/* 101 */       for (int k = 0; k < this.d.h() * this.d.g() + 1; k++) {
/* 102 */         if (k != this.d.f()) {
/*     */ 
/*     */           
/* 105 */           bmb bmb = this.d.a(k).e();
/* 106 */           if (!bmb.a() && Math.min(i, bmb.c()) < bmb.E() + 1) {
/*     */             return;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/* 112 */     int j = a(bool, i, bool1);
/* 113 */     IntArrayList intArrayList = new IntArrayList();
/* 114 */     if (this.b.a(☃, (IntList)intArrayList, j)) {
/*     */       
/* 116 */       int k = j;
/* 117 */       for (IntListIterator<Integer> intListIterator = intArrayList.iterator(); intListIterator.hasNext(); ) { int m = ((Integer)intListIterator.next()).intValue();
/* 118 */         int n = bfy.a(m).c();
/* 119 */         if (n < k) {
/* 120 */           k = n;
/*     */         } }
/*     */       
/* 123 */       j = k;
/*     */ 
/*     */       
/* 126 */       if (this.b.a(☃, (IntList)intArrayList, j)) {
/* 127 */         a();
/* 128 */         a(this.d.g(), this.d.h(), this.d.f(), ☃, (Iterator<Integer>)intArrayList.iterator(), j);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(Iterator<Integer> ☃, int i, int j, int k, int m) {
/* 135 */     bjr bjr = this.d.a(i);
/* 136 */     bmb bmb = bfy.a(((Integer)☃.next()).intValue());
/* 137 */     if (!bmb.a()) {
/* 138 */       for (int n = 0; n < j; n++) {
/* 139 */         a(bjr, bmb);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected int a(boolean ☃, int i, boolean bool1) {
/* 145 */     int j = 1;
/* 146 */     if (☃) {
/* 147 */       j = i;
/* 148 */     } else if (bool1) {
/* 149 */       j = 64;
/* 150 */       for (int k = 0; k < this.d.g() * this.d.h() + 1; k++) {
/* 151 */         if (k != this.d.f()) {
/*     */ 
/*     */ 
/*     */           
/* 155 */           bmb bmb = this.d.a(k).e();
/* 156 */           if (!bmb.a() && j > bmb.E()) {
/* 157 */             j = bmb.E();
/*     */           }
/*     */         } 
/*     */       } 
/* 161 */       if (j < 64) {
/* 162 */         j++;
/*     */       }
/*     */     } 
/*     */     
/* 166 */     return j;
/*     */   }
/*     */   
/*     */   protected void a(bjr ☃, bmb bmb1) {
/* 170 */     int i = this.c.c(bmb1);
/* 171 */     if (i == -1) {
/*     */       return;
/*     */     }
/* 174 */     bmb bmb2 = this.c.a(i).i();
/*     */     
/* 176 */     if (bmb2.a()) {
/*     */       return;
/*     */     }
/*     */     
/* 180 */     if (bmb2.E() > 1) {
/* 181 */       this.c.a(i, 1);
/*     */     } else {
/* 183 */       this.c.b(i);
/*     */     } 
/* 185 */     bmb2.e(1);
/*     */     
/* 187 */     if (☃.e().a()) {
/* 188 */       ☃.d(bmb2);
/*     */     } else {
/* 190 */       ☃.e().f(1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean b() {
/* 195 */     List<bmb> ☃ = Lists.newArrayList();
/* 196 */     int i = c();
/*     */     
/* 198 */     for (int j = 0; j < this.d.g() * this.d.h() + 1; j++) {
/* 199 */       if (j != this.d.f()) {
/*     */ 
/*     */ 
/*     */         
/* 203 */         bmb bmb = this.d.a(j).e().i();
/* 204 */         if (!bmb.a()) {
/*     */ 
/*     */ 
/*     */           
/* 208 */           int k = this.c.d(bmb);
/* 209 */           if (k == -1 && ☃.size() <= i) {
/* 210 */             for (bmb bmb1 : ☃) {
/* 211 */               if (bmb1.a(bmb) && bmb1.E() != bmb1.c() && bmb1.E() + bmb.E() <= bmb1.c()) {
/* 212 */                 bmb1.f(bmb.E());
/* 213 */                 bmb.e(0);
/*     */                 
/*     */                 break;
/*     */               } 
/*     */             } 
/* 218 */             if (!bmb.a()) {
/* 219 */               if (☃.size() < i) {
/* 220 */                 ☃.add(bmb);
/*     */               } else {
/* 222 */                 return false;
/*     */               
/*     */               }
/*     */ 
/*     */             
/*     */             }
/*     */           }
/* 229 */           else if (k == -1) {
/* 230 */             return false;
/*     */           } 
/*     */         } 
/*     */       } 
/* 234 */     }  return true;
/*     */   }
/*     */   
/*     */   private int c() {
/* 238 */     int ☃ = 0;
/* 239 */     for (bmb bmb : this.c.a) {
/* 240 */       if (bmb.a()) {
/* 241 */         ☃++;
/*     */       }
/*     */     } 
/* 244 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\va.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */