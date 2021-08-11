/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Iterables;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.DoubleArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
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
/*     */ public class za
/*     */ {
/*  45 */   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new of("commands.data.merge.failed")); private static final DynamicCommandExceptionType e; private static final DynamicCommandExceptionType f; static {
/*  46 */     e = new DynamicCommandExceptionType(☃ -> new of("commands.data.get.invalid", new Object[] { ☃ }));
/*  47 */     f = new DynamicCommandExceptionType(☃ -> new of("commands.data.get.unknown", new Object[] { ☃ }));
/*  48 */   } private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(new of("commands.data.get.multiple")); private static final DynamicCommandExceptionType h; static {
/*  49 */     h = new DynamicCommandExceptionType(☃ -> new of("commands.data.modify.expected_list", new Object[] { ☃ }));
/*  50 */     i = new DynamicCommandExceptionType(☃ -> new of("commands.data.modify.expected_object", new Object[] { ☃ }));
/*  51 */     j = new DynamicCommandExceptionType(☃ -> new of("commands.data.modify.invalid_index", new Object[] { ☃ }));
/*     */   }
/*  53 */   private static final DynamicCommandExceptionType i; private static final DynamicCommandExceptionType j; public static final List<Function<String, c>> a = (List<Function<String, c>>)ImmutableList.of(zb.a, yy.a, zc.a); public static final List<c> b; public static final List<c> c;
/*     */   static {
/*  55 */     b = (List<c>)a.stream().map(☃ -> (c)☃.apply("target")).collect(ImmutableList.toImmutableList());
/*  56 */     c = (List<c>)a.stream().map(☃ -> (c)☃.apply("source")).collect(ImmutableList.toImmutableList());
/*     */   }
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  59 */     LiteralArgumentBuilder<db> literalArgumentBuilder = (LiteralArgumentBuilder<db>)dc.a("data").requires(☃ -> ☃.c(2));
/*     */     
/*  61 */     for (c c : b) {
/*  62 */       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)literalArgumentBuilder
/*  63 */         .then(c
/*  64 */           .a((ArgumentBuilder)dc.a("merge"), argumentBuilder -> argumentBuilder.then(dc.<T>a("nbt", dh.a()).executes(())))))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  71 */         .then(c
/*  72 */           .a((ArgumentBuilder)dc.a("get"), argumentBuilder -> argumentBuilder.executes(()).then(((RequiredArgumentBuilder)dc.<T>a("path", dr.a()).executes(())).then(dc.<T>a("scale", (ArgumentType<T>)DoubleArgumentType.doubleArg()).executes(()))))))
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
/*  84 */         .then(c
/*  85 */           .a((ArgumentBuilder)dc.a("remove"), argumentBuilder -> argumentBuilder.then(dc.<T>a("path", dr.a()).executes(())))))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  92 */         .then(a((☃, b1) -> ☃.then(dc.a("insert").then(dc.<T>a("index", (ArgumentType<T>)IntegerArgumentType.integer()).then(b1.create(())))).then(dc.a("prepend").then(b1.create(()))).then(dc.a("append").then(b1.create(()))).then(dc.a("set").then(b1.create(()))).then(dc.a("merge").then(b1.create(())))));
/*     */     }
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
/* 159 */     ☃.register(literalArgumentBuilder);
/*     */   }
/*     */   
/*     */   private static int a(int ☃, md md1, dr.h h1, List<mt> list) throws CommandSyntaxException {
/* 163 */     Collection<mt> collection = h1.a(md1, mj::new);
/*     */     
/* 165 */     int i = 0;
/* 166 */     for (mt mt : collection) {
/* 167 */       if (!(mt instanceof mc)) {
/* 168 */         throw h.create(mt);
/*     */       }
/*     */       
/* 171 */       boolean bool = false;
/* 172 */       mc<?> mc = (mc)mt;
/* 173 */       int j = (☃ < 0) ? (mc.size() + ☃ + 1) : ☃;
/* 174 */       for (mt mt1 : list) {
/*     */         try {
/* 176 */           if (mc.b(j, mt1.c())) {
/* 177 */             j++;
/* 178 */             bool = true;
/*     */           } 
/* 180 */         } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 181 */           throw j.create(Integer.valueOf(j));
/*     */         } 
/*     */       } 
/* 184 */       i += bool ? 1 : 0;
/*     */     } 
/*     */     
/* 187 */     return i;
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
/*     */   private static ArgumentBuilder<db, ?> a(BiConsumer<ArgumentBuilder<db, ?>, b> ☃) {
/* 199 */     LiteralArgumentBuilder<db> literalArgumentBuilder = dc.a("modify");
/*     */     
/* 201 */     for (Iterator<c> iterator = b.iterator(); iterator.hasNext(); ) { c c = iterator.next();
/* 202 */       c.a((ArgumentBuilder)literalArgumentBuilder, argumentBuilder -> {
/*     */             RequiredArgumentBuilder<db, ?> requiredArgumentBuilder = dc.a("targetPath", dr.a());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             for (c c2 : c) {
/*     */               ☃.accept(requiredArgumentBuilder, ());
/*     */             }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             ☃.accept(requiredArgumentBuilder, ());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             return argumentBuilder.then((ArgumentBuilder)requiredArgumentBuilder);
/*     */           }); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 241 */     return (ArgumentBuilder)literalArgumentBuilder;
/*     */   }
/*     */   
/*     */   private static int a(CommandContext<db> ☃, c c1, a a1, List<mt> list) throws CommandSyntaxException {
/* 245 */     yz yz = c1.a(☃);
/* 246 */     dr.h h = dr.a(☃, "targetPath");
/*     */     
/* 248 */     md md = yz.a();
/*     */     
/* 250 */     int i = a1.modify(☃, md, h, list);
/*     */     
/* 252 */     if (i == 0) {
/* 253 */       throw d.create();
/*     */     }
/*     */     
/* 256 */     yz.a(md);
/* 257 */     ((db)☃.getSource()).a(yz.b(), true);
/*     */     
/* 259 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, yz yz1, dr.h h1) throws CommandSyntaxException {
/* 263 */     md md = yz1.a();
/*     */     
/* 265 */     int i = h1.c(md);
/*     */     
/* 267 */     if (i == 0) {
/* 268 */       throw d.create();
/*     */     }
/*     */     
/* 271 */     yz1.a(md);
/* 272 */     ☃.a(yz1.b(), true);
/* 273 */     return i;
/*     */   }
/*     */   
/*     */   private static mt a(dr.h ☃, yz yz1) throws CommandSyntaxException {
/* 277 */     Collection<mt> collection = ☃.a(yz1.a());
/* 278 */     Iterator<mt> iterator = collection.iterator();
/* 279 */     mt mt = iterator.next();
/* 280 */     if (iterator.hasNext()) {
/* 281 */       throw g.create();
/*     */     }
/*     */     
/* 284 */     return mt;
/*     */   }
/*     */   private static int b(db ☃, yz yz1, dr.h h1) throws CommandSyntaxException {
/*     */     int i;
/* 288 */     mt mt = a(h1, yz1);
/*     */     
/* 290 */     if (mt instanceof mq) {
/* 291 */       i = afm.c(((mq)mt).i());
/* 292 */     } else if (mt instanceof mc) {
/* 293 */       i = ((mc)mt).size();
/* 294 */     } else if (mt instanceof md) {
/* 295 */       i = ((md)mt).e();
/* 296 */     } else if (mt instanceof ms) {
/* 297 */       i = mt.f_().length();
/*     */     } else {
/* 299 */       throw f.create(h1.toString());
/*     */     } 
/* 301 */     ☃.a(yz1.a(mt), false);
/* 302 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, yz yz1, dr.h h1, double d) throws CommandSyntaxException {
/* 306 */     mt mt = a(h1, yz1);
/* 307 */     if (!(mt instanceof mq)) {
/* 308 */       throw e.create(h1.toString());
/*     */     }
/* 310 */     int i = afm.c(((mq)mt).i() * d);
/* 311 */     ☃.a(yz1.a(h1, d, i), false);
/* 312 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, yz yz1) throws CommandSyntaxException {
/* 316 */     ☃.a(yz1.a(yz1.a()), false);
/* 317 */     return 1;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, yz yz1, md md1) throws CommandSyntaxException {
/* 321 */     md md2 = yz1.a();
/* 322 */     md md3 = md2.g().a(md1);
/*     */     
/* 324 */     if (md2.equals(md3)) {
/* 325 */       throw d.create();
/*     */     }
/*     */     
/* 328 */     yz1.a(md3);
/*     */     
/* 330 */     ☃.a(yz1.b(), true);
/* 331 */     return 1;
/*     */   }
/*     */   
/*     */   public static interface c {
/*     */     yz a(CommandContext<db> param1CommandContext) throws CommandSyntaxException;
/*     */     
/*     */     ArgumentBuilder<db, ?> a(ArgumentBuilder<db, ?> param1ArgumentBuilder, Function<ArgumentBuilder<db, ?>, ArgumentBuilder<db, ?>> param1Function);
/*     */   }
/*     */   
/*     */   static interface b {
/*     */     ArgumentBuilder<db, ?> create(za.a param1a);
/*     */   }
/*     */   
/*     */   static interface a {
/*     */     int modify(CommandContext<db> param1CommandContext, md param1md, dr.h param1h, List<mt> param1List) throws CommandSyntaxException;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\za.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */