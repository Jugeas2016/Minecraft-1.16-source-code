/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.WeakHashMap;
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
/*     */ public class bzf
/*     */   extends cba
/*     */ {
/*  22 */   public static final cey a = cex.r;
/*     */ 
/*     */   
/*  25 */   private static final Map<brc, List<a>> b = new WeakHashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected bzf(ceg.c ☃) {
/*  33 */     super(☃, hd.a);
/*  34 */     j(((ceh)this.n.b()).a(a, Boolean.valueOf(true)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/*  39 */     for (gc gc : gc.values()) {
/*  40 */       brx1.b(fx1.a(gc), this);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/*  46 */     if (bool) {
/*     */       return;
/*     */     }
/*     */     
/*  50 */     for (gc gc : gc.values()) {
/*  51 */       brx1.b(fx1.a(gc), this);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brc brc1, fx fx1, gc gc1) {
/*  57 */     if (((Boolean)☃.c(a)).booleanValue() && gc.b != gc1) {
/*  58 */       return 15;
/*     */     }
/*     */     
/*  61 */     return 0;
/*     */   }
/*     */   
/*     */   protected boolean a(brx ☃, fx fx1, ceh ceh1) {
/*  65 */     return ☃.a(fx1.c(), gc.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/*  70 */     boolean bool = a(aag1, fx1, ☃);
/*     */     
/*  72 */     List<a> list = b.get(aag1);
/*  73 */     while (list != null && !list.isEmpty() && aag1.T() - a.a(list.get(0)) > 60L) {
/*  74 */       list.remove(0);
/*     */     }
/*     */     
/*  77 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*  78 */       if (bool) {
/*  79 */         aag1.a(fx1, ☃.a(a, Boolean.valueOf(false)), 3);
/*     */         
/*  81 */         if (a(aag1, fx1, true)) {
/*  82 */           aag1.c(1502, fx1, 0);
/*  83 */           aag1.j().a(fx1, aag1.d_(fx1).b(), 160);
/*     */         }
/*     */       
/*     */       } 
/*  87 */     } else if (!bool && !a(aag1, fx1, false)) {
/*  88 */       aag1.a(fx1, ☃.a(a, Boolean.valueOf(true)), 3);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/*  95 */     if (((Boolean)☃.c(a)).booleanValue() == a(brx1, fx1, ☃) && !brx1.J().b(fx1, this)) {
/*  96 */       brx1.J().a(fx1, this, 2);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(ceh ☃, brc brc1, fx fx1, gc gc1) {
/* 102 */     if (gc1 == gc.a) {
/* 103 */       return ☃.b(brc1, fx1, gc1);
/*     */     }
/* 105 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b_(ceh ☃) {
/* 110 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 115 */     if (!((Boolean)☃.c(a)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/* 119 */     double d1 = fx1.u() + 0.5D + (random.nextDouble() - 0.5D) * 0.2D;
/* 120 */     double d2 = fx1.v() + 0.7D + (random.nextDouble() - 0.5D) * 0.2D;
/* 121 */     double d3 = fx1.w() + 0.5D + (random.nextDouble() - 0.5D) * 0.2D;
/*     */     
/* 123 */     brx1.a(this.e, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 128 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private final fx a;
/*     */     private final long b;
/*     */     
/*     */     public a(fx ☃, long l) {
/* 136 */       this.a = ☃;
/* 137 */       this.b = l;
/*     */     }
/*     */   }
/*     */   
/*     */   private static boolean a(brx ☃, fx fx1, boolean bool) {
/* 142 */     List<a> list = b.computeIfAbsent(☃, ☃ -> Lists.newArrayList());
/*     */     
/* 144 */     if (bool) {
/* 145 */       list.add(new a(fx1.h(), ☃.T()));
/*     */     }
/*     */     
/* 148 */     int i = 0;
/* 149 */     for (int j = 0; j < list.size(); j++) {
/* 150 */       a a = list.get(j);
/*     */       
/* 152 */       i++;
/* 153 */       if (a.b(a).equals(fx1) && i >= 8) {
/* 154 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 158 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bzf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */