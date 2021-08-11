/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Queues;
/*     */ import java.util.Deque;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.Random;
/*     */ import org.apache.commons.lang3.mutable.MutableObject;
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
/*     */ final class c
/*     */ {
/*     */   private final gm<cok> a;
/*     */   private final int b;
/*     */   private final coe.a c;
/*     */   private final cfy d;
/*     */   private final csw e;
/*     */   private final List<? super cro> f;
/*     */   private final Random g;
/*  62 */   private final Deque<coe.b> h = Queues.newArrayDeque();
/*     */   
/*     */   private c(gm<cok> ☃, int i, coe.a a1, cfy cfy1, csw csw1, List<? super cro> list, Random random) {
/*  65 */     this.a = ☃;
/*  66 */     this.b = i;
/*  67 */     this.c = a1;
/*  68 */     this.d = cfy1;
/*  69 */     this.e = csw1;
/*  70 */     this.f = list;
/*  71 */     this.g = random;
/*     */   }
/*     */   
/*     */   private void a(cro ☃, MutableObject<ddh> mutableObject, int i, int j, boolean bool) {
/*  75 */     coi coi = ☃.b();
/*  76 */     fx fx = ☃.c();
/*  77 */     bzm bzm = ☃.ap_();
/*     */     
/*  79 */     cok.a a1 = coi.e();
/*  80 */     boolean bool1 = (a1 == cok.a.b);
/*     */     
/*  82 */     MutableObject<ddh> mutableObject1 = new MutableObject();
/*     */     
/*  84 */     cra cra = ☃.g();
/*  85 */     int k = cra.b;
/*     */     
/*  87 */     for (ctb.c c1 : coi.a(this.e, fx, bzm, this.g)) {
/*  88 */       MutableObject<ddh> mutableObject2; int i1; gc gc = bxr.h(c1.b);
/*     */       
/*  90 */       fx fx1 = c1.a;
/*  91 */       fx fx2 = fx1.a(gc);
/*     */       
/*  93 */       int m = fx1.v() - k;
/*  94 */       int n = -1;
/*     */       
/*  96 */       vk vk1 = new vk(c1.c.l("pool"));
/*  97 */       Optional<cok> optional1 = this.a.b(vk1);
/*     */       
/*  99 */       if (!optional1.isPresent() || (((cok)optional1.get()).c() == 0 && !Objects.equals(vk1, kk.a.a()))) {
/* 100 */         coe.a().warn("Empty or none existent pool: {}", vk1);
/*     */         
/*     */         continue;
/*     */       } 
/* 104 */       vk vk2 = ((cok)optional1.get()).a();
/* 105 */       Optional<cok> optional2 = this.a.b(vk2);
/*     */       
/* 107 */       if (!optional2.isPresent() || (((cok)optional2.get()).c() == 0 && !Objects.equals(vk2, kk.a.a()))) {
/* 108 */         coe.a().warn("Empty or none existent fallback pool: {}", vk2);
/*     */ 
/*     */         
/*     */         continue;
/*     */       } 
/*     */ 
/*     */       
/* 115 */       boolean bool2 = cra.b(fx2);
/* 116 */       if (bool2) {
/* 117 */         mutableObject2 = mutableObject1;
/* 118 */         i1 = k;
/* 119 */         if (mutableObject1.getValue() == null) {
/* 120 */           mutableObject1.setValue(dde.a(dci.a(cra)));
/*     */         }
/*     */       } else {
/* 123 */         mutableObject2 = mutableObject;
/* 124 */         i1 = i;
/*     */       } 
/*     */ 
/*     */       
/* 128 */       List<coi> list = Lists.newArrayList();
/* 129 */       if (j != this.b) {
/* 130 */         list.addAll(((cok)optional1.get()).b(this.g));
/*     */       }
/* 132 */       list.addAll(((cok)optional2.get()).b(this.g));
/*     */ 
/*     */       
/* 135 */       for (coi coi1 : list) {
/* 136 */         if (coi1 == cob.b) {
/*     */           break;
/*     */         }
/*     */         
/* 140 */         for (bzm bzm1 : bzm.b(this.g)) {
/* 141 */           int i2; List<ctb.c> list1 = coi1.a(this.e, fx.b, bzm1, this.g);
/* 142 */           cra cra1 = coi1.a(this.e, fx.b, bzm1);
/*     */ 
/*     */           
/* 145 */           if (!bool || cra1.e() > 16) {
/* 146 */             i2 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           }
/*     */           else {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 158 */             i2 = list1.stream().mapToInt(c1 -> { if (!☃.b(c1.a.a(bxr.h(c1.b)))) return 0;  vk vk = new vk(c1.c.l("pool")); Optional<cok> optional1 = this.a.b(vk); Optional<cok> optional2 = optional1.flatMap(()); int i = ((Integer)optional1.<Integer>map(()).orElse(Integer.valueOf(0))).intValue(); int j = ((Integer)optional2.<Integer>map(()).orElse(Integer.valueOf(0))).intValue(); return Math.max(i, j); }).max().orElse(0);
/*     */           } 
/*     */           
/* 161 */           for (ctb.c c2 : list1) {
/* 162 */             int i6, i9, i10; if (!bxr.a(c1, c2)) {
/*     */               continue;
/*     */             }
/*     */             
/* 166 */             fx fx3 = c2.a;
/*     */             
/* 168 */             fx fx4 = new fx(fx2.u() - fx3.u(), fx2.v() - fx3.v(), fx2.w() - fx3.w());
/* 169 */             cra cra2 = coi1.a(this.e, fx4, bzm1);
/* 170 */             int i3 = cra2.b;
/*     */             
/* 172 */             cok.a a2 = coi1.e();
/* 173 */             boolean bool3 = (a2 == cok.a.b);
/*     */ 
/*     */             
/* 176 */             int i4 = fx3.v();
/*     */             
/* 178 */             int i5 = m - i4 + bxr.h(c1.b).j();
/*     */ 
/*     */             
/* 181 */             if (bool1 && bool3) {
/* 182 */               i6 = k + i5;
/*     */             } else {
/* 184 */               if (n == -1) {
/* 185 */                 n = this.d.b(fx1.u(), fx1.w(), chn.a.a);
/*     */               }
/* 187 */               i6 = n - i4;
/*     */             } 
/*     */             
/* 190 */             int i7 = i6 - i3;
/*     */             
/* 192 */             cra cra3 = cra2.b(0, i7, 0);
/* 193 */             fx fx5 = fx4.b(0, i7, 0);
/*     */             
/* 195 */             if (i2 > 0) {
/* 196 */               int i11 = Math.max(i2 + 1, cra3.e - cra3.b);
/* 197 */               cra3.e = cra3.b + i11;
/*     */             } 
/*     */ 
/*     */ 
/*     */             
/* 202 */             if (dde.c((ddh)mutableObject2.getValue(), dde.a(dci.a(cra3).h(0.25D)), dcr.c)) {
/*     */               continue;
/*     */             }
/*     */             
/* 206 */             mutableObject2.setValue(dde.b((ddh)mutableObject2.getValue(), dde.a(dci.a(cra3)), dcr.e));
/*     */             
/* 208 */             int i8 = ☃.d();
/*     */             
/* 210 */             if (bool3) {
/*     */               
/* 212 */               i9 = i8 - i5;
/*     */             } else {
/* 214 */               i9 = coi1.f();
/*     */             } 
/*     */             
/* 217 */             cro cro1 = this.c.create(this.e, coi1, fx5, i9, bzm1, cra3);
/*     */ 
/*     */             
/* 220 */             if (bool1) {
/* 221 */               i10 = k + m;
/* 222 */             } else if (bool3) {
/* 223 */               i10 = i6 + i4;
/*     */             } else {
/* 225 */               if (n == -1) {
/* 226 */                 n = this.d.b(fx1.u(), fx1.w(), chn.a.a);
/*     */               }
/* 228 */               i10 = n + i5 / 2;
/*     */             } 
/*     */             
/* 231 */             ☃.a(new cod(fx2
/* 232 */                   .u(), i10 - m + i8, fx2
/*     */                   
/* 234 */                   .w(), i5, a2));
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 239 */             cro1.a(new cod(fx1
/* 240 */                   .u(), i10 - i4 + i9, fx1
/*     */                   
/* 242 */                   .w(), -i5, a1));
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 247 */             this.f.add(cro1);
/* 248 */             if (j + 1 <= this.b)
/* 249 */               this.h.addLast(new coe.b(cro1, mutableObject2, i1, j + 1, null)); 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\coe$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */