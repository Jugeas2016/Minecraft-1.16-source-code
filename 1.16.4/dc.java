/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.ParseResults;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import com.mojang.brigadier.tree.RootCommandNode;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class dc
/*     */ {
/* 116 */   private static final Logger a = LogManager.getLogger();
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
/* 129 */   private final CommandDispatcher<db> b = new CommandDispatcher();
/*     */   
/*     */   public enum a {
/* 132 */     a(true, true),
/* 133 */     b(false, true),
/* 134 */     c(true, false);
/*     */     
/*     */     private final boolean d;
/*     */     
/*     */     private final boolean e;
/*     */     
/*     */     a(boolean ☃, boolean bool1) {
/* 141 */       this.d = ☃;
/* 142 */       this.e = bool1;
/*     */     }
/*     */   }
/*     */   
/*     */   public dc(a ☃) {
/* 147 */     wf.a(this.b);
/* 148 */     wg.a(this.b);
/* 149 */     wx.a(this.b);
/* 150 */     wk.a(this.b);
/* 151 */     wl.a(this.b);
/* 152 */     wm.a(this.b);
/* 153 */     za.a(this.b);
/* 154 */     wn.a(this.b);
/* 155 */     wp.a(this.b);
/* 156 */     ws.a(this.b);
/* 157 */     wt.a(this.b);
/* 158 */     wu.a(this.b);
/* 159 */     wv.a(this.b);
/* 160 */     ww.a(this.b);
/* 161 */     wy.a(this.b);
/* 162 */     wz.a(this.b);
/* 163 */     xa.a(this.b);
/* 164 */     xb.a(this.b);
/* 165 */     xc.a(this.b);
/* 166 */     xd.a(this.b);
/* 167 */     xe.a(this.b);
/* 168 */     xf.a(this.b);
/* 169 */     xg.a(this.b);
/* 170 */     xh.a(this.b);
/* 171 */     xi.a(this.b);
/* 172 */     xk.a(this.b);
/* 173 */     xj.a(this.b);
/* 174 */     xl.a(this.b);
/* 175 */     xm.a(this.b);
/* 176 */     xq.a(this.b);
/* 177 */     xr.a(this.b);
/* 178 */     xv.a(this.b);
/* 179 */     xu.a(this.b);
/* 180 */     xw.a(this.b);
/* 181 */     ya.a(this.b);
/* 182 */     yb.a(this.b);
/* 183 */     yc.a(this.b);
/* 184 */     yd.a(this.b, (☃ != a.c));
/* 185 */     ye.a(this.b);
/* 186 */     yg.a(this.b);
/* 187 */     yh.a(this.b);
/* 188 */     yi.a(this.b);
/* 189 */     yj.a(this.b);
/* 190 */     yl.a(this.b);
/* 191 */     ym.a(this.b);
/* 192 */     yn.a(this.b);
/* 193 */     yo.a(this.b);
/* 194 */     yp.a(this.b);
/* 195 */     yq.a(this.b);
/* 196 */     yr.a(this.b);
/* 197 */     ys.a(this.b);
/* 198 */     yt.a(this.b);
/* 199 */     yu.a(this.b);
/* 200 */     yv.a(this.b);
/* 201 */     yx.a(this.b);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 209 */     if (w.d) {
/* 210 */       lt.a(this.b);
/*     */     }
/*     */     
/* 213 */     if (a.a(☃)) {
/* 214 */       wh.a(this.b);
/* 215 */       wi.a(this.b);
/* 216 */       wj.a(this.b);
/* 217 */       wo.a(this.b);
/* 218 */       xn.a(this.b);
/* 219 */       xo.a(this.b);
/* 220 */       xp.a(this.b);
/* 221 */       xx.a(this.b);
/* 222 */       xy.a(this.b);
/* 223 */       xz.a(this.b);
/* 224 */       yf.a(this.b);
/* 225 */       yk.a(this.b);
/* 226 */       yw.a(this.b);
/*     */     } 
/*     */     
/* 229 */     if (a.b(☃)) {
/* 230 */       xs.a(this.b);
/*     */     }
/*     */     
/* 233 */     this.b.findAmbiguities((☃, commandNode1, commandNode2, collection) -> a.warn("Ambiguity between arguments {} and {} with inputs: {}", this.b.getPath(commandNode1), this.b.getPath(commandNode2), collection));
/*     */ 
/*     */ 
/*     */     
/* 237 */     this.b.setConsumer((☃, bool, i) -> ((db)☃.getSource()).a(☃, bool, i));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(db ☃, String str) {
/* 243 */     StringReader stringReader = new StringReader(str);
/* 244 */     if (stringReader.canRead() && stringReader.peek() == '/') {
/* 245 */       stringReader.skip();
/*     */     }
/* 247 */     ☃.j().aQ().a(str);
/*     */     try {
/* 249 */       return this.b.execute(stringReader, ☃);
/* 250 */     } catch (cz cz) {
/* 251 */       ☃.a(cz.a());
/* 252 */       return 0;
/* 253 */     } catch (CommandSyntaxException commandSyntaxException) {
/* 254 */       ☃.a(ns.a(commandSyntaxException.getRawMessage()));
/* 255 */       if (commandSyntaxException.getInput() != null && commandSyntaxException.getCursor() >= 0) {
/* 256 */         int i = Math.min(commandSyntaxException.getInput().length(), commandSyntaxException.getCursor());
/* 257 */         nx nx = (new oe("")).a(k.h).a(ob1 -> ob1.a(new np(np.a.d, ☃)));
/*     */ 
/*     */         
/* 260 */         if (i > 10) {
/* 261 */           nx.c("...");
/*     */         }
/* 263 */         nx.c(commandSyntaxException.getInput().substring(Math.max(0, i - 10), i));
/* 264 */         if (i < commandSyntaxException.getInput().length()) {
/* 265 */           nr nr = (new oe(commandSyntaxException.getInput().substring(i))).a(new k[] { k.m, k.t });
/* 266 */           nx.a(nr);
/*     */         } 
/* 268 */         nx.a((new of("command.context.here")).a(new k[] { k.m, k.u }));
/* 269 */         ☃.a(nx);
/*     */       } 
/* 271 */       return 0;
/* 272 */     } catch (Exception exception) {
/* 273 */       nx nx = new oe((exception.getMessage() == null) ? exception.getClass().getName() : exception.getMessage());
/* 274 */       if (a.isDebugEnabled()) {
/* 275 */         a.error("Command exception: {}", str, exception);
/* 276 */         StackTraceElement[] arrayOfStackTraceElement = exception.getStackTrace();
/* 277 */         for (int i = 0; i < Math.min(arrayOfStackTraceElement.length, 3); i++) {
/* 278 */           nx.c("\n\n")
/* 279 */             .c(arrayOfStackTraceElement[i].getMethodName())
/* 280 */             .c("\n ")
/* 281 */             .c(arrayOfStackTraceElement[i].getFileName())
/* 282 */             .c(":")
/* 283 */             .c(String.valueOf(arrayOfStackTraceElement[i].getLineNumber()));
/*     */         }
/*     */       } 
/* 286 */       ☃.a((new of("command.failed")).a(ob1 -> ob1.a(new nv((nv.a)nv.a.a, (T)☃))));
/* 287 */       if (w.d) {
/* 288 */         ☃.a(new oe(x.d(exception)));
/* 289 */         a.error("'" + str + "' threw an exception", exception);
/*     */       } 
/*     */       
/* 292 */       return 0;
/*     */     } finally {
/* 294 */       ☃.j().aQ().c();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(aah ☃) {
/* 299 */     Map<CommandNode<db>, CommandNode<dd>> map = Maps.newHashMap();
/* 300 */     RootCommandNode<dd> rootCommandNode = new RootCommandNode();
/* 301 */     map.put(this.b.getRoot(), rootCommandNode);
/* 302 */     a((CommandNode<db>)this.b.getRoot(), (CommandNode<dd>)rootCommandNode, ☃.cw(), map);
/* 303 */     ☃.b.a(new pd(rootCommandNode));
/*     */   }
/*     */   
/*     */   private void a(CommandNode<db> ☃, CommandNode<dd> commandNode, db db1, Map<CommandNode<db>, CommandNode<dd>> map) {
/* 307 */     for (CommandNode<db> commandNode1 : (Iterable<CommandNode<db>>)☃.getChildren()) {
/* 308 */       if (commandNode1.canUse(db1)) {
/* 309 */         ArgumentBuilder<dd, ?> argumentBuilder = commandNode1.createBuilder();
/* 310 */         argumentBuilder.requires(☃ -> true);
/* 311 */         if (argumentBuilder.getCommand() != null)
/*     */         {
/*     */           
/* 314 */           argumentBuilder.executes(☃ -> 0);
/*     */         }
/* 316 */         if (argumentBuilder instanceof RequiredArgumentBuilder) {
/* 317 */           RequiredArgumentBuilder<dd, ?> requiredArgumentBuilder = (RequiredArgumentBuilder<dd, ?>)argumentBuilder;
/* 318 */           if (requiredArgumentBuilder.getSuggestionsProvider() != null)
/*     */           {
/*     */             
/* 321 */             requiredArgumentBuilder.suggests(fm.b(requiredArgumentBuilder.getSuggestionsProvider()));
/*     */           }
/*     */         } 
/* 324 */         if (argumentBuilder.getRedirect() != null) {
/* 325 */           argumentBuilder.redirect(map.get(argumentBuilder.getRedirect()));
/*     */         }
/* 327 */         CommandNode<dd> commandNode2 = argumentBuilder.build();
/* 328 */         map.put(commandNode1, commandNode2);
/* 329 */         commandNode.addChild(commandNode2);
/* 330 */         if (!commandNode1.getChildren().isEmpty()) {
/* 331 */           a(commandNode1, commandNode2, db1, map);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static LiteralArgumentBuilder<db> a(String ☃) {
/* 338 */     return LiteralArgumentBuilder.literal(☃);
/*     */   }
/*     */   
/*     */   public static <T> RequiredArgumentBuilder<db, T> a(String ☃, ArgumentType<T> argumentType) {
/* 342 */     return RequiredArgumentBuilder.argument(☃, argumentType);
/*     */   }
/*     */   
/*     */   public static Predicate<String> a(b ☃) {
/* 346 */     return str -> {
/*     */         try {
/*     */           ☃.parse(new StringReader(str));
/*     */           return true;
/* 350 */         } catch (CommandSyntaxException commandSyntaxException) {
/*     */           return false;
/*     */         } 
/*     */       };
/*     */   }
/*     */   
/*     */   public CommandDispatcher<db> a() {
/* 357 */     return this.b;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static <S> CommandSyntaxException a(ParseResults<S> ☃) {
/* 362 */     if (!☃.getReader().canRead())
/* 363 */       return null; 
/* 364 */     if (☃.getExceptions().size() == 1)
/* 365 */       return ☃.getExceptions().values().iterator().next(); 
/* 366 */     if (☃.getContext().getRange().isEmpty()) {
/* 367 */       return CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext(☃.getReader());
/*     */     }
/* 369 */     return CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownArgument().createWithContext(☃.getReader());
/*     */   }
/*     */   
/*     */   public static void b() {
/* 373 */     RootCommandNode<db> ☃ = (new dc(a.a)).a().getRoot();
/* 374 */     Set<ArgumentType<?>> set1 = fk.a((CommandNode<db>)☃);
/* 375 */     Set<ArgumentType<?>> set2 = (Set<ArgumentType<?>>)set1.stream().filter(☃ -> !fk.a(☃)).collect(Collectors.toSet());
/* 376 */     if (!set2.isEmpty()) {
/* 377 */       a.warn("Missing type registration for following arguments:\n {}", set2.stream().map(☃ -> "\t" + ☃).collect(Collectors.joining(",\n")));
/* 378 */       throw new IllegalStateException("Unregistered argument types");
/*     */     } 
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface b {
/*     */     void parse(StringReader param1StringReader) throws CommandSyntaxException;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */