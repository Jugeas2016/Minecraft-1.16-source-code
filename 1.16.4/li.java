/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Streams;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import org.apache.commons.lang3.mutable.MutableInt;
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
/*     */ public class li
/*     */ {
/*  40 */   public static lw a = new lo();
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
/*     */   public static void a(lf ☃, fx fx1, ll ll1) {
/*  52 */     ☃.a();
/*  53 */     ll1.a(☃);
/*     */     
/*  55 */     ☃.a(new lg()
/*     */         {
/*     */           public void a(lf ☃) {
/*  58 */             li.a(☃, bup.dg);
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           public void c(lf ☃) {
/*  69 */             li.a(☃, ☃.q() ? bup.dm : bup.cZ);
/*  70 */             li.a(☃, x.d(☃.n()));
/*  71 */             li.b(☃);
/*     */           }
/*     */         });
/*  74 */     ☃.a(fx1, 2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Collection<lf> a(Collection<la> ☃, fx fx1, bzm bzm1, aag aag1, ll ll1, int i) {
/*  83 */     lb lb = new lb(☃, fx1, bzm1, aag1, ll1, i);
/*  84 */     lb.b();
/*  85 */     return lb.a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Collection<lf> b(Collection<lu> ☃, fx fx1, bzm bzm1, aag aag1, ll ll1, int i) {
/*  92 */     return a(a(☃), fx1, bzm1, aag1, ll1, i);
/*     */   }
/*     */   
/*     */   public static Collection<la> a(Collection<lu> ☃) {
/*  96 */     Map<String, Collection<lu>> map = Maps.newHashMap();
/*     */ 
/*     */     
/*  99 */     ☃.forEach(lu1 -> {
/*     */           String str = lu1.e();
/*     */           
/*     */           Collection<lu> collection = ☃.computeIfAbsent(str, ());
/*     */           
/*     */           collection.add(lu1);
/*     */         });
/* 106 */     return (Collection<la>)map.keySet().stream().flatMap(str -> {
/*     */           Collection<lu> collection = (Collection<lu>)☃.get(str);
/*     */           
/*     */           Consumer<aag> consumer = lh.c(str);
/*     */           MutableInt mutableInt = new MutableInt();
/*     */           return Streams.stream(Iterables.partition(collection, 100)).map(());
/* 112 */         }).collect(Collectors.toList());
/*     */   }
/*     */   
/*     */   private static void c(lf ☃) {
/* 116 */     Throwable throwable = ☃.n();
/* 117 */     String str = (☃.q() ? "" : "(optional) ") + ☃.c() + " failed! " + x.d(throwable);
/*     */     
/* 119 */     a(☃.g(), ☃.q() ? k.m : k.o, str);
/*     */     
/* 121 */     if (throwable instanceof kz) {
/* 122 */       kz kz = (kz)throwable;
/* 123 */       a(☃.g(), kz.c(), kz.a());
/*     */     } 
/*     */     
/* 126 */     a.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void b(lf ☃, buo buo1) {
/* 136 */     aag aag = ☃.g();
/* 137 */     fx fx1 = ☃.d();
/* 138 */     fx fx2 = new fx(-1, -1, -1);
/* 139 */     fx fx3 = ctb.a(fx1.a(fx2), byg.a, ☃.t(), fx1);
/* 140 */     aag.a(fx3, bup.es.n().a(☃.t()));
/*     */     
/* 142 */     fx fx4 = fx3.b(0, 1, 0);
/* 143 */     aag.a(fx4, buo1.n());
/*     */     
/* 145 */     for (int i = -1; i <= 1; i++) {
/* 146 */       for (int j = -1; j <= 1; j++) {
/* 147 */         fx fx = fx3.b(i, -1, j);
/* 148 */         aag.a(fx, bup.bF.n());
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void b(lf ☃, String str) {
/* 154 */     aag aag = ☃.g();
/* 155 */     fx fx1 = ☃.d();
/* 156 */     fx fx2 = new fx(-1, 1, -1);
/* 157 */     fx fx3 = ctb.a(fx1.a(fx2), byg.a, ☃.t(), fx1);
/*     */     
/* 159 */     aag.a(fx3, bup.lY.n().a(☃.t()));
/*     */     
/* 161 */     ceh ceh = aag.d_(fx3);
/*     */     
/* 163 */     bmb bmb = a(☃.c(), ☃.q(), str);
/*     */     
/* 165 */     bxy.a(aag, fx3, ceh, bmb);
/*     */   }
/*     */   
/*     */   private static bmb a(String ☃, boolean bool, String str1) {
/* 169 */     bmb bmb = new bmb(bmd.oT);
/* 170 */     mj mj = new mj();
/*     */     
/* 172 */     StringBuffer stringBuffer = new StringBuffer();
/* 173 */     Arrays.<String>stream(☃.split("\\.")).forEach(str -> ☃.append(str).append('\n'));
/*     */ 
/*     */     
/* 176 */     if (!bool) {
/* 177 */       stringBuffer.append("(optional)\n");
/*     */     }
/*     */     
/* 180 */     stringBuffer.append("-------------------\n");
/*     */     
/* 182 */     mj.add(ms.a(stringBuffer.toString() + str1));
/* 183 */     bmb.a("pages", mj);
/* 184 */     return bmb;
/*     */   }
/*     */   
/*     */   private static void a(aag ☃, k k1, String str) {
/* 188 */     ☃.a(☃ -> true).forEach(aah1 -> aah1.a((new oe(☃)).a(k1), x.b));
/*     */   }
/*     */   
/*     */   public static void a(aag ☃) {
/* 192 */     rz.a(☃);
/*     */   }
/*     */   
/*     */   private static void a(aag ☃, fx fx1, String str) {
/* 196 */     rz.a(☃, fx1, str, -2130771968, 2147483647);
/*     */   }
/*     */   
/*     */   public static void a(aag ☃, fx fx1, ll ll1, int i) {
/* 200 */     ll1.a();
/* 201 */     fx fx2 = fx1.b(-i, 0, -i);
/* 202 */     fx fx3 = fx1.b(i, 0, i);
/* 203 */     fx.b(fx2, fx3)
/* 204 */       .filter(fx1 -> ☃.d_(fx1).a(bup.mY))
/* 205 */       .forEach(fx1 -> {
/*     */           cdj cdj = (cdj)☃.c(fx1);
/*     */           fx fx2 = cdj.o();
/*     */           cra cra = lq.b(cdj);
/*     */           lq.a(cra, fx2.v(), ☃);
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\li.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */