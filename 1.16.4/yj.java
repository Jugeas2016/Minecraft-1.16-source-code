/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.BoolArgumentType;
/*     */ import com.mojang.brigadier.arguments.FloatArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType;
/*     */ import java.util.Collection;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
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
/*     */ public class yj
/*     */ {
/*     */   private static final Dynamic4CommandExceptionType a;
/*     */   private static final Dynamic4CommandExceptionType b;
/*     */   
/*     */   static {
/*  45 */     a = new Dynamic4CommandExceptionType((☃, object1, object2, object3) -> new of("commands.spreadplayers.failed.teams", new Object[] { ☃, object1, object2, object3 }));
/*  46 */     b = new Dynamic4CommandExceptionType((☃, object1, object2, object3) -> new of("commands.spreadplayers.failed.entities", new Object[] { ☃, object1, object2, object3 }));
/*     */   }
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  49 */     ☃.register(
/*  50 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("spreadplayers")
/*  51 */         .requires(☃ -> ☃.c(2)))
/*  52 */         .then(
/*  53 */           dc.<T>a("center", eq.a())
/*  54 */           .then(
/*  55 */             dc.<T>a("spreadDistance", (ArgumentType<T>)FloatArgumentType.floatArg(0.0F))
/*  56 */             .then((
/*  57 */               (RequiredArgumentBuilder)dc.<T>a("maxRange", (ArgumentType<T>)FloatArgumentType.floatArg(1.0F))
/*  58 */               .then(
/*  59 */                 dc.<T>a("respectTeams", (ArgumentType<T>)BoolArgumentType.bool())
/*  60 */                 .then(
/*  61 */                   dc.<T>a("targets", dk.b())
/*  62 */                   .executes(☃ -> a((db)☃.getSource(), eq.a(☃, "center"), FloatArgumentType.getFloat(☃, "spreadDistance"), FloatArgumentType.getFloat(☃, "maxRange"), 256, BoolArgumentType.getBool(☃, "respectTeams"), dk.b(☃, "targets"))))))
/*     */ 
/*     */               
/*  65 */               .then(
/*  66 */                 dc.a("under")
/*  67 */                 .then(
/*  68 */                   dc.<T>a("maxHeight", (ArgumentType<T>)IntegerArgumentType.integer(0))
/*  69 */                   .then(
/*  70 */                     dc.<T>a("respectTeams", (ArgumentType<T>)BoolArgumentType.bool())
/*  71 */                     .then(
/*  72 */                       dc.<T>a("targets", dk.b())
/*  73 */                       .executes(☃ -> a((db)☃.getSource(), eq.a(☃, "center"), FloatArgumentType.getFloat(☃, "spreadDistance"), FloatArgumentType.getFloat(☃, "maxRange"), IntegerArgumentType.getInteger(☃, "maxHeight"), BoolArgumentType.getBool(☃, "respectTeams"), dk.b(☃, "targets")))))))))));
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
/*     */   private static int a(db ☃, dcm dcm1, float f1, float f2, int i, boolean bool, Collection<? extends aqa> collection) throws CommandSyntaxException {
/*  85 */     Random random = new Random();
/*  86 */     double d1 = (dcm1.i - f2);
/*  87 */     double d2 = (dcm1.j - f2);
/*  88 */     double d3 = (dcm1.i + f2);
/*  89 */     double d4 = (dcm1.j + f2);
/*     */     
/*  91 */     a[] arrayOfA = a(random, bool ? a(collection) : collection.size(), d1, d2, d3, d4);
/*  92 */     a(dcm1, f1, ☃.e(), random, d1, d2, d3, d4, i, arrayOfA, bool);
/*  93 */     double d5 = a(collection, ☃.e(), arrayOfA, i, bool);
/*     */     
/*  95 */     ☃.a(new of("commands.spreadplayers.success." + (bool ? "teams" : "entities"), new Object[] { Integer.valueOf(arrayOfA.length), Float.valueOf(dcm1.i), Float.valueOf(dcm1.j), String.format(Locale.ROOT, "%.2f", new Object[] { Double.valueOf(d5) }) }), true);
/*  96 */     return arrayOfA.length;
/*     */   }
/*     */   
/*     */   private static int a(Collection<? extends aqa> ☃) {
/* 100 */     Set<ddp> set = Sets.newHashSet();
/*     */     
/* 102 */     for (aqa aqa : ☃) {
/* 103 */       if (aqa instanceof bfw) {
/* 104 */         set.add(aqa.bG()); continue;
/*     */       } 
/* 106 */       set.add(null);
/*     */     } 
/*     */ 
/*     */     
/* 110 */     return set.size();
/*     */   }
/*     */   
/*     */   private static void a(dcm ☃, double d1, aag aag1, Random random, double d2, double d3, double d4, double d5, int i, a[] arrayOfA, boolean bool) throws CommandSyntaxException {
/* 114 */     boolean bool1 = true;
/*     */     
/* 116 */     double d = 3.4028234663852886E38D;
/*     */     int j;
/* 118 */     for (j = 0; j < 10000 && bool1; j++) {
/* 119 */       bool1 = false;
/* 120 */       d = 3.4028234663852886E38D;
/*     */       
/* 122 */       for (int k = 0; k < arrayOfA.length; k++) {
/* 123 */         a a1 = arrayOfA[k];
/* 124 */         int m = 0;
/* 125 */         a a2 = new a();
/*     */         
/* 127 */         for (int n = 0; n < arrayOfA.length; n++) {
/* 128 */           if (k != n) {
/*     */ 
/*     */             
/* 131 */             a a3 = arrayOfA[n];
/*     */             
/* 133 */             double d6 = a1.a(a3);
/* 134 */             d = Math.min(d6, d);
/* 135 */             if (d6 < d1) {
/* 136 */               m++;
/* 137 */               a.a(a2, a.c(a2) + a.c(a3) - a.c(a1));
/* 138 */               a.b(a2, a.d(a2) + a.d(a3) - a.d(a1));
/*     */             } 
/*     */           } 
/*     */         } 
/* 142 */         if (m > 0) {
/* 143 */           a.a(a2, a.c(a2) / m);
/* 144 */           a.b(a2, a.d(a2) / m);
/* 145 */           double d6 = a2.b();
/*     */           
/* 147 */           if (d6 > 0.0D) {
/* 148 */             a2.a();
/*     */             
/* 150 */             a1.b(a2);
/*     */           } else {
/* 152 */             a1.a(random, d2, d3, d4, d5);
/*     */           } 
/*     */           
/* 155 */           bool1 = true;
/*     */         } 
/*     */         
/* 158 */         if (a1.a(d2, d3, d4, d5)) {
/* 159 */           bool1 = true;
/*     */         }
/*     */       } 
/*     */       
/* 163 */       if (!bool1) {
/* 164 */         for (a a1 : arrayOfA) {
/* 165 */           if (!a1.b(aag1, i)) {
/* 166 */             a1.a(random, d2, d3, d4, d5);
/* 167 */             bool1 = true;
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 174 */     if (d == 3.4028234663852886E38D) {
/* 175 */       d = 0.0D;
/*     */     }
/*     */     
/* 178 */     if (j >= 10000) {
/* 179 */       if (bool) {
/* 180 */         throw a.create(Integer.valueOf(arrayOfA.length), Float.valueOf(☃.i), Float.valueOf(☃.j), String.format(Locale.ROOT, "%.2f", new Object[] { Double.valueOf(d) }));
/*     */       }
/* 182 */       throw b.create(Integer.valueOf(arrayOfA.length), Float.valueOf(☃.i), Float.valueOf(☃.j), String.format(Locale.ROOT, "%.2f", new Object[] { Double.valueOf(d) }));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static double a(Collection<? extends aqa> ☃, aag aag1, a[] arrayOfA, int i, boolean bool) {
/* 188 */     double d = 0.0D;
/* 189 */     int j = 0;
/* 190 */     Map<ddp, a> map = Maps.newHashMap();
/*     */     
/* 192 */     for (aqa aqa : ☃) {
/*     */       a a1;
/*     */       
/* 195 */       if (bool) {
/* 196 */         ddp ddp = (aqa instanceof bfw) ? aqa.bG() : null;
/*     */         
/* 198 */         if (!map.containsKey(ddp)) {
/* 199 */           map.put(ddp, arrayOfA[j++]);
/*     */         }
/*     */         
/* 202 */         a1 = map.get(ddp);
/*     */       } else {
/* 204 */         a1 = arrayOfA[j++];
/*     */       } 
/*     */       
/* 207 */       aqa.m(afm.c(a.c(a1)) + 0.5D, a1.a(aag1, i), afm.c(a.d(a1)) + 0.5D);
/*     */       
/* 209 */       double d1 = Double.MAX_VALUE;
/* 210 */       for (a a2 : arrayOfA) {
/* 211 */         if (a1 != a2) {
/*     */ 
/*     */ 
/*     */           
/* 215 */           double d2 = a1.a(a2);
/* 216 */           d1 = Math.min(d2, d1);
/*     */         } 
/* 218 */       }  d += d1;
/*     */     } 
/* 220 */     if (☃.size() < 2) {
/* 221 */       return 0.0D;
/*     */     }
/*     */     
/* 224 */     d /= ☃.size();
/* 225 */     return d;
/*     */   }
/*     */   
/*     */   private static a[] a(Random ☃, int i, double d1, double d2, double d3, double d4) {
/* 229 */     a[] arrayOfA = new a[i];
/*     */     
/* 231 */     for (int j = 0; j < arrayOfA.length; j++) {
/* 232 */       a a = new a();
/* 233 */       a.a(☃, d1, d2, d3, d4);
/* 234 */       arrayOfA[j] = a;
/*     */     } 
/*     */     
/* 237 */     return arrayOfA;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static class a
/*     */   {
/*     */     private double a;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private double b;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     double a(a ☃) {
/* 258 */       double d1 = this.a - ☃.a;
/* 259 */       double d2 = this.b - ☃.b;
/*     */       
/* 261 */       return Math.sqrt(d1 * d1 + d2 * d2);
/*     */     }
/*     */     
/*     */     void a() {
/* 265 */       double ☃ = b();
/* 266 */       this.a /= ☃;
/* 267 */       this.b /= ☃;
/*     */     }
/*     */     
/*     */     float b() {
/* 271 */       return afm.a(this.a * this.a + this.b * this.b);
/*     */     }
/*     */     
/*     */     public void b(a ☃) {
/* 275 */       this.a -= ☃.a;
/* 276 */       this.b -= ☃.b;
/*     */     }
/*     */     
/*     */     public boolean a(double ☃, double d1, double d2, double d3) {
/* 280 */       boolean bool = false;
/*     */       
/* 282 */       if (this.a < ☃) {
/* 283 */         this.a = ☃;
/* 284 */         bool = true;
/* 285 */       } else if (this.a > d2) {
/* 286 */         this.a = d2;
/* 287 */         bool = true;
/*     */       } 
/*     */       
/* 290 */       if (this.b < d1) {
/* 291 */         this.b = d1;
/* 292 */         bool = true;
/* 293 */       } else if (this.b > d3) {
/* 294 */         this.b = d3;
/* 295 */         bool = true;
/*     */       } 
/*     */       
/* 298 */       return bool;
/*     */     }
/*     */     
/*     */     public int a(brc ☃, int i) {
/* 302 */       fx.a a1 = new fx.a(this.a, (i + 1), this.b);
/* 303 */       boolean bool1 = ☃.d_(a1).g();
/* 304 */       a1.c(gc.a);
/* 305 */       boolean bool2 = ☃.d_(a1).g();
/* 306 */       while (a1.v() > 0) {
/* 307 */         a1.c(gc.a);
/* 308 */         boolean bool = ☃.d_(a1).g();
/*     */         
/* 310 */         if (!bool && bool2 && bool1) {
/* 311 */           return a1.v() + 1;
/*     */         }
/* 313 */         bool1 = bool2;
/* 314 */         bool2 = bool;
/*     */       } 
/*     */       
/* 317 */       return i + 1;
/*     */     }
/*     */     
/*     */     public boolean b(brc ☃, int i) {
/* 321 */       fx fx = new fx(this.a, (a(☃, i) - 1), this.b);
/* 322 */       ceh ceh = ☃.d_(fx);
/* 323 */       cva cva = ceh.c();
/* 324 */       return (fx.v() < i && !cva.a() && cva != cva.n);
/*     */     }
/*     */     
/*     */     public void a(Random ☃, double d1, double d2, double d3, double d4) {
/* 328 */       this.a = afm.a(☃, d1, d3);
/* 329 */       this.b = afm.a(☃, d2, d4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */