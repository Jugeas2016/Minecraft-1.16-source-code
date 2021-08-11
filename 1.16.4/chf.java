/*    */ import com.google.common.collect.ImmutableList;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum chf
/*    */ {
/* 18 */   a
/*    */   {
/*    */     public void a(aag ☃, chg chg1, List<bbq> list, int i, fx fx1) {
/* 21 */       fx fx2 = new fx(0, 128, 0);
/* 22 */       for (bbq bbq : list) {
/* 23 */         bbq.a(fx2);
/*    */       }
/* 25 */       chg1.a(b);
/*    */     }
/*    */   },
/* 28 */   b
/*    */   {
/*    */     public void a(aag ☃, chg chg1, List<bbq> list, int i, fx fx1) {
/* 31 */       if (i < 100) {
/* 32 */         if (i == 0 || i == 50 || i == 51 || i == 52 || i >= 95) {
/* 33 */           ☃.c(3001, new fx(0, 128, 0), 0);
/*    */         }
/*    */       } else {
/* 36 */         chg1.a(c);
/*    */       } 
/*    */     }
/*    */   },
/* 40 */   c
/*    */   {
/*    */     public void a(aag ☃, chg chg1, List<bbq> list, int i, fx fx1) {
/* 43 */       int j = 40;
/* 44 */       boolean bool1 = (i % 40 == 0);
/* 45 */       boolean bool2 = (i % 40 == 39);
/* 46 */       if (bool1 || bool2) {
/* 47 */         List<ckx.a> list1 = ckx.a(☃);
/* 48 */         int k = i / 40;
/* 49 */         if (k < list1.size()) {
/* 50 */           ckx.a a = list1.get(k);
/*    */           
/* 52 */           if (bool1) {
/* 53 */             for (bbq bbq : list) {
/* 54 */               bbq.a(new fx(a.a(), a.d() + 1, a.b()));
/*    */             }
/*    */           } else {
/* 57 */             int m = 10;
/* 58 */             for (fx fx2 : fx.a(new fx(a
/* 59 */                   .a() - 10, a.d() - 10, a.b() - 10), new fx(a
/* 60 */                   .a() + 10, a.d() + 10, a.b() + 10)))
/*    */             {
/* 62 */               ☃.a(fx2, false);
/*    */             }
/* 64 */             ☃.a((aqa)null, (a.a() + 0.5F), a.d(), (a.b() + 0.5F), 5.0F, brp.a.c);
/*    */             
/* 66 */             cmv cmv = new cmv(true, (List<ckx.a>)ImmutableList.of(a), new fx(0, 128, 0));
/* 67 */             cjl.B.b(cmv).a(☃, ☃.i().g(), new Random(), new fx(a.a(), 45, a.b()));
/*    */           } 
/* 69 */         } else if (bool1) {
/* 70 */           chg1.a(d);
/*    */         } 
/*    */       } 
/*    */     }
/*    */   },
/* 75 */   d
/*    */   {
/*    */     public void a(aag ☃, chg chg1, List<bbq> list, int i, fx fx1) {
/* 78 */       if (i >= 100) {
/* 79 */         chg1.a(e);
/* 80 */         chg1.f();
/* 81 */         for (bbq bbq : list) {
/* 82 */           bbq.a((fx)null);
/* 83 */           ☃.a(bbq, bbq.cD(), bbq.cE(), bbq.cH(), 6.0F, brp.a.a);
/* 84 */           bbq.ad();
/*    */         } 
/* 86 */       } else if (i >= 80) {
/* 87 */         ☃.c(3001, new fx(0, 128, 0), 0);
/* 88 */       } else if (i == 0) {
/* 89 */         for (bbq bbq : list) {
/* 90 */           bbq.a(new fx(0, 128, 0));
/*    */         }
/* 92 */       } else if (i < 5) {
/* 93 */         ☃.c(3001, new fx(0, 128, 0), 0);
/*    */       } 
/*    */     }
/*    */   },
/* 97 */   e {
/*    */     public void a(aag ☃, chg chg1, List<bbq> list, int i, fx fx1) {}
/*    */   };
/*    */   
/*    */   public abstract void a(aag paramaag, chg paramchg, List<bbq> paramList, int paramInt, fx paramfx);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\chf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */