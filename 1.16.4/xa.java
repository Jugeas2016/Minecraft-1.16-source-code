/*     */ import com.google.common.base.Joiner;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
/*     */ import java.util.function.Function;
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
/*     */ public class xa
/*     */ {
/*     */   private static final Dynamic2CommandExceptionType a;
/*     */   private static final Dynamic2CommandExceptionType b;
/*     */   
/*     */   static {
/*  28 */     a = new Dynamic2CommandExceptionType((☃, object1) -> new of("commands.forceload.toobig", new Object[] { ☃, object1 }));
/*  29 */     b = new Dynamic2CommandExceptionType((☃, object1) -> new of("commands.forceload.query.failure", new Object[] { ☃, object1 }));
/*  30 */   } private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new of("commands.forceload.added.failure"));
/*  31 */   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new of("commands.forceload.removed.failure"));
/*     */   
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  34 */     ☃.register(
/*  35 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("forceload")
/*  36 */         .requires(☃ -> ☃.c(2)))
/*  37 */         .then(
/*  38 */           dc.a("add")
/*  39 */           .then((
/*  40 */             (RequiredArgumentBuilder)dc.<T>a("from", el.a())
/*  41 */             .executes(☃ -> a((db)☃.getSource(), el.a(☃, "from"), el.a(☃, "from"), true)))
/*  42 */             .then(
/*  43 */               dc.<T>a("to", el.a())
/*  44 */               .executes(☃ -> a((db)☃.getSource(), el.a(☃, "from"), el.a(☃, "to"), true))))))
/*     */         
/*  46 */         .then((
/*  47 */           (LiteralArgumentBuilder)dc.a("remove")
/*  48 */           .then((
/*  49 */             (RequiredArgumentBuilder)dc.<T>a("from", el.a())
/*  50 */             .executes(☃ -> a((db)☃.getSource(), el.a(☃, "from"), el.a(☃, "from"), false)))
/*  51 */             .then(
/*  52 */               dc.<T>a("to", el.a())
/*  53 */               .executes(☃ -> a((db)☃.getSource(), el.a(☃, "from"), el.a(☃, "to"), false)))))
/*  54 */           .then(
/*  55 */             dc.a("all")
/*  56 */             .executes(☃ -> b((db)☃.getSource())))))
/*     */ 
/*     */         
/*  59 */         .then((
/*  60 */           (LiteralArgumentBuilder)dc.a("query")
/*  61 */           .executes(☃ -> a((db)☃.getSource())))
/*  62 */           .then(
/*  63 */             dc.<T>a("pos", el.a())
/*  64 */             .executes(☃ -> a((db)☃.getSource(), el.a(☃, "pos"))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(db ☃, zw zw1) throws CommandSyntaxException {
/*  71 */     brd brd = new brd(zw1.a >> 4, zw1.b >> 4);
/*  72 */     aag aag = ☃.e();
/*  73 */     vj<brx> vj = aag.Y();
/*  74 */     boolean bool = aag.w().contains(brd.a());
/*     */     
/*  76 */     if (bool) {
/*  77 */       ☃.a(new of("commands.forceload.query.success", new Object[] { brd, vj.a() }), false);
/*  78 */       return 1;
/*     */     } 
/*  80 */     throw b.create(brd, vj.a());
/*     */   }
/*     */ 
/*     */   
/*     */   private static int a(db ☃) {
/*  85 */     aag aag = ☃.e();
/*  86 */     vj<brx> vj = aag.Y();
/*  87 */     LongSet longSet = aag.w();
/*  88 */     int i = longSet.size();
/*     */     
/*  90 */     if (i > 0) {
/*  91 */       String str = Joiner.on(", ").join(longSet.stream().sorted().map(brd::new).map(brd::toString).iterator());
/*     */       
/*  93 */       if (i == 1) {
/*  94 */         ☃.a(new of("commands.forceload.list.single", new Object[] { vj.a(), str }), false);
/*     */       } else {
/*  96 */         ☃.a(new of("commands.forceload.list.multiple", new Object[] { Integer.valueOf(i), vj.a(), str }), false);
/*     */       } 
/*     */     } else {
/*  99 */       ☃.a(new of("commands.forceload.added.none", new Object[] { vj.a() }));
/*     */     } 
/* 101 */     return i;
/*     */   }
/*     */   
/*     */   private static int b(db ☃) {
/* 105 */     aag aag = ☃.e();
/* 106 */     vj<brx> vj = aag.Y();
/* 107 */     LongSet longSet = aag.w();
/* 108 */     longSet.forEach(l -> ☃.a(brd.a(l), brd.b(l), false));
/* 109 */     ☃.a(new of("commands.forceload.removed.all", new Object[] { vj.a() }), true);
/* 110 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, zw zw1, zw zw2, boolean bool) throws CommandSyntaxException {
/* 114 */     int i = Math.min(zw1.a, zw2.a);
/* 115 */     int j = Math.min(zw1.b, zw2.b);
/* 116 */     int k = Math.max(zw1.a, zw2.a);
/* 117 */     int m = Math.max(zw1.b, zw2.b);
/*     */     
/* 119 */     if (i < -30000000 || j < -30000000 || k >= 30000000 || m >= 30000000)
/*     */     {
/*     */ 
/*     */ 
/*     */       
/* 124 */       throw ek.b.create();
/*     */     }
/*     */     
/* 127 */     int n = i >> 4;
/* 128 */     int i1 = j >> 4;
/* 129 */     int i2 = k >> 4;
/* 130 */     int i3 = m >> 4;
/*     */     
/* 132 */     long l = ((i2 - n) + 1L) * ((i3 - i1) + 1L);
/*     */     
/* 134 */     if (l > 256L) {
/* 135 */       throw a.create(Integer.valueOf(256), Long.valueOf(l));
/*     */     }
/*     */     
/* 138 */     aag aag = ☃.e();
/* 139 */     vj<brx> vj = aag.Y();
/*     */     
/* 141 */     brd brd = null;
/* 142 */     int i4 = 0;
/* 143 */     for (int i5 = n; i5 <= i2; i5++) {
/* 144 */       for (int i6 = i1; i6 <= i3; i6++) {
/* 145 */         boolean bool1 = aag.a(i5, i6, bool);
/* 146 */         if (bool1) {
/* 147 */           i4++;
/* 148 */           if (brd == null) {
/* 149 */             brd = new brd(i5, i6);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 155 */     if (i4 == 0)
/* 156 */       throw (bool ? c : d).create(); 
/* 157 */     if (i4 == 1) {
/* 158 */       ☃.a(new of("commands.forceload." + (bool ? "added" : "removed") + ".single", new Object[] { brd, vj.a() }), true);
/*     */     } else {
/* 160 */       brd brd1 = new brd(n, i1);
/* 161 */       brd brd2 = new brd(i2, i3);
/* 162 */       ☃.a(new of("commands.forceload." + (bool ? "added" : "removed") + ".multiple", new Object[] { Integer.valueOf(i4), vj.a(), brd1, brd2 }), true);
/*     */     } 
/*     */     
/* 165 */     return i4;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */