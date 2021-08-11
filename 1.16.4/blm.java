/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Arrays;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class blm
/*     */   extends blx
/*     */ {
/*     */   public blm(blx.a ☃) {
/*  40 */     super(☃);
/*     */   }
/*     */   
/*     */   public enum a { private static final a[] f;
/*  44 */     a(0, "small_ball"),
/*  45 */     b(1, "large_ball"),
/*  46 */     c(2, "star"),
/*  47 */     d(3, "creeper"),
/*  48 */     e(4, "burst");
/*     */     
/*     */     static {
/*  51 */       f = (a[])Arrays.<a>stream(values()).sorted(Comparator.comparingInt(☃ -> ☃.g)).toArray(☃ -> new a[☃]);
/*     */     }
/*     */     private final int g;
/*     */     private final String h;
/*     */     
/*     */     a(int ☃, String str1) {
/*  57 */       this.g = ☃;
/*  58 */       this.h = str1;
/*     */     }
/*     */     
/*     */     public int a() {
/*  62 */       return this.g;
/*     */     }
/*     */     
/*     */     public String b() {
/*  66 */       return this.h;
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/*  70 */       if (☃ < 0 || ☃ >= f.length) {
/*  71 */         return a;
/*     */       }
/*  73 */       return f[☃];
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public aou a(boa ☃) {
/*  79 */     brx brx = ☃.p();
/*  80 */     if (!brx.v) {
/*  81 */       bmb bmb = ☃.m();
/*     */       
/*  83 */       dcn dcn = ☃.k();
/*  84 */       gc gc = ☃.j();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  90 */       bgh bgh = new bgh(brx, ☃.n(), dcn.b + gc.i() * 0.15D, dcn.c + gc.j() * 0.15D, dcn.d + gc.k() * 0.15D, bmb);
/*     */ 
/*     */       
/*  93 */       brx.c(bgh);
/*     */       
/*  95 */       bmb.g(1);
/*     */     } 
/*  97 */     return aou.a(brx.v);
/*     */   }
/*     */ 
/*     */   
/*     */   public aov<bmb> a(brx ☃, bfw bfw1, aot aot1) {
/* 102 */     if (bfw1.ef()) {
/* 103 */       bmb bmb = bfw1.b(aot1);
/* 104 */       if (!☃.v) {
/* 105 */         ☃.c(new bgh(☃, bmb, bfw1));
/* 106 */         if (!bfw1.bC.d) {
/* 107 */           bmb.g(1);
/*     */         }
/*     */       } 
/*     */       
/* 111 */       return aov.a(bfw1.b(aot1), ☃.s_());
/*     */     } 
/* 113 */     return aov.c(bfw1.b(aot1));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bmb ☃, @Nullable brx brx1, List<nr> list, bnl bnl1) {
/* 119 */     md md = ☃.b("Fireworks");
/* 120 */     if (md == null) {
/*     */       return;
/*     */     }
/* 123 */     if (md.c("Flight", 99)) {
/* 124 */       list.add((new of("item.minecraft.firework_rocket.flight")).c(" ").c(String.valueOf(md.f("Flight"))).a(k.h));
/*     */     }
/*     */     
/* 127 */     mj mj = md.d("Explosions", 10);
/* 128 */     if (!mj.isEmpty())
/* 129 */       for (int i = 0; i < mj.size(); i++) {
/* 130 */         md md1 = mj.a(i);
/*     */         
/* 132 */         List<nr> list1 = Lists.newArrayList();
/* 133 */         bln.a(md1, list1);
/*     */         
/* 135 */         if (!list1.isEmpty()) {
/* 136 */           for (int j = 1; j < list1.size(); j++) {
/* 137 */             list1.set(j, (new oe("  ")).a(list1.get(j)).a(k.h));
/*     */           }
/*     */           
/* 140 */           list.addAll(list1);
/*     */         } 
/*     */       }  
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\blm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */