/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.FloatArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.Locale;
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
/*     */ public class yx
/*     */ {
/*  25 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.worldborder.center.failed"));
/*  26 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("commands.worldborder.set.failed.nochange"));
/*  27 */   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new of("commands.worldborder.set.failed.small."));
/*  28 */   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new of("commands.worldborder.set.failed.big."));
/*  29 */   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(new of("commands.worldborder.warning.time.failed"));
/*  30 */   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(new of("commands.worldborder.warning.distance.failed"));
/*  31 */   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(new of("commands.worldborder.damage.buffer.failed"));
/*  32 */   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(new of("commands.worldborder.damage.amount.failed"));
/*     */   
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  35 */     ☃.register(
/*  36 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("worldborder")
/*  37 */         .requires(☃ -> ☃.c(2)))
/*  38 */         .then(
/*  39 */           dc.a("add")
/*  40 */           .then((
/*  41 */             (RequiredArgumentBuilder)dc.<T>a("distance", (ArgumentType<T>)FloatArgumentType.floatArg(-6.0E7F, 6.0E7F))
/*  42 */             .executes(☃ -> a((db)☃.getSource(), ((db)☃.getSource()).e().f().i() + FloatArgumentType.getFloat(☃, "distance"), 0L)))
/*  43 */             .then(
/*  44 */               dc.<T>a("time", (ArgumentType<T>)IntegerArgumentType.integer(0))
/*  45 */               .executes(☃ -> a((db)☃.getSource(), ((db)☃.getSource()).e().f().i() + FloatArgumentType.getFloat(☃, "distance"), ((db)☃.getSource()).e().f().j() + IntegerArgumentType.getInteger(☃, "time") * 1000L))))))
/*     */ 
/*     */ 
/*     */         
/*  49 */         .then(
/*  50 */           dc.a("set")
/*  51 */           .then((
/*  52 */             (RequiredArgumentBuilder)dc.<T>a("distance", (ArgumentType<T>)FloatArgumentType.floatArg(-6.0E7F, 6.0E7F))
/*  53 */             .executes(☃ -> a((db)☃.getSource(), FloatArgumentType.getFloat(☃, "distance"), 0L)))
/*  54 */             .then(
/*  55 */               dc.<T>a("time", (ArgumentType<T>)IntegerArgumentType.integer(0))
/*  56 */               .executes(☃ -> a((db)☃.getSource(), FloatArgumentType.getFloat(☃, "distance"), IntegerArgumentType.getInteger(☃, "time") * 1000L))))))
/*     */ 
/*     */ 
/*     */         
/*  60 */         .then(
/*  61 */           dc.a("center")
/*  62 */           .then(
/*  63 */             dc.<T>a("pos", eq.a())
/*  64 */             .executes(☃ -> a((db)☃.getSource(), eq.a(☃, "pos"))))))
/*     */ 
/*     */         
/*  67 */         .then((
/*  68 */           (LiteralArgumentBuilder)dc.a("damage")
/*  69 */           .then(
/*  70 */             dc.a("amount")
/*  71 */             .then(
/*  72 */               dc.<T>a("damagePerBlock", (ArgumentType<T>)FloatArgumentType.floatArg(0.0F))
/*  73 */               .executes(☃ -> b((db)☃.getSource(), FloatArgumentType.getFloat(☃, "damagePerBlock"))))))
/*     */ 
/*     */           
/*  76 */           .then(
/*  77 */             dc.a("buffer")
/*  78 */             .then(
/*  79 */               dc.<T>a("distance", (ArgumentType<T>)FloatArgumentType.floatArg(0.0F))
/*  80 */               .executes(☃ -> a((db)☃.getSource(), FloatArgumentType.getFloat(☃, "distance")))))))
/*     */ 
/*     */ 
/*     */         
/*  84 */         .then(
/*  85 */           dc.a("get")
/*  86 */           .executes(☃ -> a((db)☃.getSource()))))
/*     */         
/*  88 */         .then((
/*  89 */           (LiteralArgumentBuilder)dc.a("warning")
/*  90 */           .then(
/*  91 */             dc.a("distance")
/*  92 */             .then(
/*  93 */               dc.<T>a("distance", (ArgumentType<T>)IntegerArgumentType.integer(0))
/*  94 */               .executes(☃ -> b((db)☃.getSource(), IntegerArgumentType.getInteger(☃, "distance"))))))
/*     */ 
/*     */           
/*  97 */           .then(
/*  98 */             dc.a("time")
/*  99 */             .then(
/* 100 */               dc.<T>a("time", (ArgumentType<T>)IntegerArgumentType.integer(0))
/* 101 */               .executes(☃ -> a((db)☃.getSource(), IntegerArgumentType.getInteger(☃, "time")))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(db ☃, float f) throws CommandSyntaxException {
/* 109 */     cfu cfu = ☃.e().f();
/* 110 */     if (cfu.n() == f) {
/* 111 */       throw g.create();
/*     */     }
/* 113 */     cfu.b(f);
/* 114 */     ☃.a(new of("commands.worldborder.damage.buffer.success", new Object[] { String.format(Locale.ROOT, "%.2f", new Object[] { Float.valueOf(f) }) }), true);
/* 115 */     return (int)f;
/*     */   }
/*     */   
/*     */   private static int b(db ☃, float f) throws CommandSyntaxException {
/* 119 */     cfu cfu = ☃.e().f();
/* 120 */     if (cfu.o() == f) {
/* 121 */       throw h.create();
/*     */     }
/* 123 */     cfu.c(f);
/* 124 */     ☃.a(new of("commands.worldborder.damage.amount.success", new Object[] { String.format(Locale.ROOT, "%.2f", new Object[] { Float.valueOf(f) }) }), true);
/* 125 */     return (int)f;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, int i) throws CommandSyntaxException {
/* 129 */     cfu cfu = ☃.e().f();
/* 130 */     if (cfu.q() == i) {
/* 131 */       throw e.create();
/*     */     }
/* 133 */     cfu.b(i);
/* 134 */     ☃.a(new of("commands.worldborder.warning.time.success", new Object[] { Integer.valueOf(i) }), true);
/* 135 */     return i;
/*     */   }
/*     */   
/*     */   private static int b(db ☃, int i) throws CommandSyntaxException {
/* 139 */     cfu cfu = ☃.e().f();
/* 140 */     if (cfu.r() == i) {
/* 141 */       throw f.create();
/*     */     }
/* 143 */     cfu.c(i);
/* 144 */     ☃.a(new of("commands.worldborder.warning.distance.success", new Object[] { Integer.valueOf(i) }), true);
/* 145 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(db ☃) {
/* 149 */     double d = ☃.e().f().i();
/* 150 */     ☃.a(new of("commands.worldborder.get", new Object[] { String.format(Locale.ROOT, "%.0f", new Object[] { Double.valueOf(d) }) }), false);
/* 151 */     return afm.c(d + 0.5D);
/*     */   }
/*     */   
/*     */   private static int a(db ☃, dcm dcm1) throws CommandSyntaxException {
/* 155 */     cfu cfu = ☃.e().f();
/* 156 */     if (cfu.a() == dcm1.i && cfu.b() == dcm1.j) {
/* 157 */       throw a.create();
/*     */     }
/*     */     
/* 160 */     cfu.c(dcm1.i, dcm1.j);
/* 161 */     ☃.a(new of("commands.worldborder.center.success", new Object[] { String.format(Locale.ROOT, "%.2f", new Object[] { Float.valueOf(dcm1.i) }), String.format("%.2f", new Object[] { Float.valueOf(dcm1.j) }) }), true);
/*     */     
/* 163 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, double d, long l) throws CommandSyntaxException {
/* 167 */     cfu cfu = ☃.e().f();
/* 168 */     double d1 = cfu.i();
/*     */     
/* 170 */     if (d1 == d) {
/* 171 */       throw b.create();
/*     */     }
/* 173 */     if (d < 1.0D) {
/* 174 */       throw c.create();
/*     */     }
/* 176 */     if (d > 6.0E7D) {
/* 177 */       throw d.create();
/*     */     }
/*     */     
/* 180 */     if (l > 0L) {
/* 181 */       cfu.a(d1, d, l);
/* 182 */       if (d > d1) {
/* 183 */         ☃.a(new of("commands.worldborder.set.grow", new Object[] { String.format(Locale.ROOT, "%.1f", new Object[] { Double.valueOf(d) }), Long.toString(l / 1000L) }), true);
/*     */       } else {
/* 185 */         ☃.a(new of("commands.worldborder.set.shrink", new Object[] { String.format(Locale.ROOT, "%.1f", new Object[] { Double.valueOf(d) }), Long.toString(l / 1000L) }), true);
/*     */       } 
/*     */     } else {
/* 188 */       cfu.a(d);
/* 189 */       ☃.a(new of("commands.worldborder.set.immediate", new Object[] { String.format(Locale.ROOT, "%.1f", new Object[] { Double.valueOf(d) }) }), true);
/*     */     } 
/*     */     
/* 192 */     return (int)(d - d1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */