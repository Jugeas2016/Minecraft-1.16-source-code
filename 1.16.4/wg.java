/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.DoubleArgumentType;
/*     */ import com.mojang.brigadier.arguments.StringArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.UUID;
/*     */ import java.util.concurrent.CompletableFuture;
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
/*     */ public class wg
/*     */ {
/*     */   private static final SuggestionProvider<db> a;
/*     */   private static final DynamicCommandExceptionType b;
/*     */   private static final Dynamic2CommandExceptionType c;
/*     */   private static final Dynamic3CommandExceptionType d;
/*     */   private static final Dynamic3CommandExceptionType e;
/*     */   
/*     */   static {
/*  38 */     a = ((☃, suggestionsBuilder) -> dd.a(gm.af.c(), suggestionsBuilder));
/*     */     
/*  40 */     b = new DynamicCommandExceptionType(☃ -> new of("commands.attribute.failed.entity", new Object[] { ☃ }));
/*  41 */     c = new Dynamic2CommandExceptionType((☃, object1) -> new of("commands.attribute.failed.no_attribute", new Object[] { ☃, object1 }));
/*  42 */     d = new Dynamic3CommandExceptionType((☃, object1, object2) -> new of("commands.attribute.failed.no_modifier", new Object[] { object1, ☃, object2 }));
/*  43 */     e = new Dynamic3CommandExceptionType((☃, object1, object2) -> new of("commands.attribute.failed.modifier_already_present", new Object[] { object2, object1, ☃ }));
/*     */   }
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  46 */     ☃.register(
/*  47 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("attribute")
/*  48 */         .requires(☃ -> ☃.c(2)))
/*  49 */         .then(
/*  50 */           dc.<T>a("target", dk.a())
/*  51 */           .then((
/*  52 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("attribute", dy.a())
/*  53 */             .suggests(a)
/*  54 */             .then((
/*  55 */               (LiteralArgumentBuilder)dc.a("get")
/*  56 */               .executes(☃ -> a((db)☃.getSource(), dk.a(☃, "target"), dy.d(☃, "attribute"), 1.0D)))
/*  57 */               .then(
/*  58 */                 dc.<T>a("scale", (ArgumentType<T>)DoubleArgumentType.doubleArg())
/*  59 */                 .executes(☃ -> a((db)☃.getSource(), dk.a(☃, "target"), dy.d(☃, "attribute"), DoubleArgumentType.getDouble(☃, "scale"))))))
/*     */ 
/*     */             
/*  62 */             .then((
/*  63 */               (LiteralArgumentBuilder)dc.a("base")
/*  64 */               .then(
/*  65 */                 dc.a("set")
/*  66 */                 .then(
/*  67 */                   dc.<T>a("value", (ArgumentType<T>)DoubleArgumentType.doubleArg())
/*  68 */                   .executes(☃ -> c((db)☃.getSource(), dk.a(☃, "target"), dy.d(☃, "attribute"), DoubleArgumentType.getDouble(☃, "value"))))))
/*     */ 
/*     */               
/*  71 */               .then((
/*  72 */                 (LiteralArgumentBuilder)dc.a("get")
/*  73 */                 .executes(☃ -> b((db)☃.getSource(), dk.a(☃, "target"), dy.d(☃, "attribute"), 1.0D)))
/*  74 */                 .then(
/*  75 */                   dc.<T>a("scale", (ArgumentType<T>)DoubleArgumentType.doubleArg())
/*  76 */                   .executes(☃ -> b((db)☃.getSource(), dk.a(☃, "target"), dy.d(☃, "attribute"), DoubleArgumentType.getDouble(☃, "scale")))))))
/*     */ 
/*     */ 
/*     */             
/*  80 */             .then((
/*  81 */               (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("modifier")
/*  82 */               .then(
/*  83 */                 dc.a("add")
/*  84 */                 .then(
/*  85 */                   dc.<T>a("uuid", ee.a())
/*  86 */                   .then(
/*  87 */                     dc.<T>a("name", (ArgumentType<T>)StringArgumentType.string())
/*  88 */                     .then((
/*  89 */                       (RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("value", (ArgumentType<T>)DoubleArgumentType.doubleArg())
/*  90 */                       .then(
/*  91 */                         dc.a("add")
/*  92 */                         .executes(☃ -> a((db)☃.getSource(), dk.a(☃, "target"), dy.d(☃, "attribute"), ee.a(☃, "uuid"), StringArgumentType.getString(☃, "name"), DoubleArgumentType.getDouble(☃, "value"), arj.a.a))))
/*     */                       
/*  94 */                       .then(
/*  95 */                         dc.a("multiply")
/*  96 */                         .executes(☃ -> a((db)☃.getSource(), dk.a(☃, "target"), dy.d(☃, "attribute"), ee.a(☃, "uuid"), StringArgumentType.getString(☃, "name"), DoubleArgumentType.getDouble(☃, "value"), arj.a.c))))
/*     */                       
/*  98 */                       .then(
/*  99 */                         dc.a("multiply_base")
/* 100 */                         .executes(☃ -> a((db)☃.getSource(), dk.a(☃, "target"), dy.d(☃, "attribute"), ee.a(☃, "uuid"), StringArgumentType.getString(☃, "name"), DoubleArgumentType.getDouble(☃, "value"), arj.a.b))))))))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 106 */               .then(
/* 107 */                 dc.a("remove")
/* 108 */                 .then(dc.<T>a("uuid", ee.a())
/* 109 */                   .executes(☃ -> a((db)☃.getSource(), dk.a(☃, "target"), dy.d(☃, "attribute"), ee.a(☃, "uuid"))))))
/*     */ 
/*     */               
/* 112 */               .then(
/* 113 */                 dc.a("value")
/* 114 */                 .then(
/* 115 */                   dc.a("get")
/* 116 */                   .then((
/* 117 */                     (RequiredArgumentBuilder)dc.<T>a("uuid", ee.a())
/* 118 */                     .executes(☃ -> a((db)☃.getSource(), dk.a(☃, "target"), dy.d(☃, "attribute"), ee.a(☃, "uuid"), 1.0D)))
/* 119 */                     .then(
/* 120 */                       dc.<T>a("scale", (ArgumentType<T>)DoubleArgumentType.doubleArg())
/* 121 */                       .executes(☃ -> a((db)☃.getSource(), dk.a(☃, "target"), dy.d(☃, "attribute"), ee.a(☃, "uuid"), DoubleArgumentType.getDouble(☃, "scale")))))))))));
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
/*     */   private static arh a(aqa ☃, arg arg1) throws CommandSyntaxException {
/* 133 */     arh arh = a(☃).dB().a(arg1);
/* 134 */     if (arh == null) {
/* 135 */       throw c.create(☃.R(), new of(arg1.c()));
/*     */     }
/* 137 */     return arh;
/*     */   }
/*     */   
/*     */   private static aqm a(aqa ☃) throws CommandSyntaxException {
/* 141 */     if (!(☃ instanceof aqm)) {
/* 142 */       throw b.create(☃.R());
/*     */     }
/* 144 */     return (aqm)☃;
/*     */   }
/*     */   
/*     */   private static aqm b(aqa ☃, arg arg1) throws CommandSyntaxException {
/* 148 */     aqm aqm = a(☃);
/* 149 */     if (!aqm.dB().b(arg1)) {
/* 150 */       throw c.create(☃.R(), new of(arg1.c()));
/*     */     }
/* 152 */     return aqm;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, aqa aqa1, arg arg1, double d) throws CommandSyntaxException {
/* 156 */     aqm aqm = b(aqa1, arg1);
/* 157 */     double d1 = aqm.b(arg1);
/* 158 */     ☃.a(new of("commands.attribute.value.get.success", new Object[] { new of(arg1.c()), aqa1.R(), Double.valueOf(d1) }), false);
/* 159 */     return (int)(d1 * d);
/*     */   }
/*     */   
/*     */   private static int b(db ☃, aqa aqa1, arg arg1, double d) throws CommandSyntaxException {
/* 163 */     aqm aqm = b(aqa1, arg1);
/* 164 */     double d1 = aqm.c(arg1);
/* 165 */     ☃.a(new of("commands.attribute.base_value.get.success", new Object[] { new of(arg1.c()), aqa1.R(), Double.valueOf(d1) }), false);
/* 166 */     return (int)(d1 * d);
/*     */   }
/*     */   
/*     */   private static int a(db ☃, aqa aqa1, arg arg1, UUID uUID, double d) throws CommandSyntaxException {
/* 170 */     aqm aqm = b(aqa1, arg1);
/*     */     
/* 172 */     ari ari = aqm.dB();
/*     */     
/* 174 */     if (!ari.a(arg1, uUID)) {
/* 175 */       throw d.create(aqa1.R(), new of(arg1.c()), uUID);
/*     */     }
/*     */     
/* 178 */     double d1 = ari.b(arg1, uUID);
/* 179 */     ☃.a(new of("commands.attribute.modifier.value.get.success", new Object[] { uUID, new of(arg1.c()), aqa1.R(), Double.valueOf(d1) }), false);
/* 180 */     return (int)(d1 * d);
/*     */   }
/*     */   
/*     */   private static int c(db ☃, aqa aqa1, arg arg1, double d) throws CommandSyntaxException {
/* 184 */     a(aqa1, arg1).a(d);
/* 185 */     ☃.a(new of("commands.attribute.base_value.set.success", new Object[] { new of(arg1.c()), aqa1.R(), Double.valueOf(d) }), false);
/* 186 */     return 1;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, aqa aqa1, arg arg1, UUID uUID, String str, double d, arj.a a1) throws CommandSyntaxException {
/* 190 */     arh arh = a(aqa1, arg1);
/* 191 */     arj arj = new arj(uUID, str, d, a1);
/* 192 */     if (arh.a(arj)) {
/* 193 */       throw e.create(aqa1.R(), new of(arg1.c()), uUID);
/*     */     }
/* 195 */     arh.c(arj);
/* 196 */     ☃.a(new of("commands.attribute.modifier.add.success", new Object[] { uUID, new of(arg1.c()), aqa1.R() }), false);
/* 197 */     return 1;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, aqa aqa1, arg arg1, UUID uUID) throws CommandSyntaxException {
/* 201 */     arh arh = a(aqa1, arg1);
/* 202 */     if (arh.c(uUID)) {
/* 203 */       ☃.a(new of("commands.attribute.modifier.remove.success", new Object[] { uUID, new of(arg1.c()), aqa1.R() }), false);
/* 204 */       return 1;
/*     */     } 
/* 206 */     throw d.create(aqa1.R(), new of(arg1.c()), uUID);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */