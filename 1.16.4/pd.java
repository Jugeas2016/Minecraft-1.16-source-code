/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Queues;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.tree.ArgumentCommandNode;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import com.mojang.brigadier.tree.LiteralCommandNode;
/*     */ import com.mojang.brigadier.tree.RootCommandNode;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMaps;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Queue;
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
/*     */ public class pd
/*     */   implements oj<om>
/*     */ {
/*     */   private RootCommandNode<dd> a;
/*     */   
/*     */   public pd() {}
/*     */   
/*     */   public pd(RootCommandNode<dd> ☃) {
/*  46 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/*  51 */     a[] arrayOfA = new a[☃.i()];
/*  52 */     for (int i = 0; i < arrayOfA.length; i++) {
/*  53 */       arrayOfA[i] = c(☃);
/*     */     }
/*     */     
/*  56 */     a(arrayOfA);
/*  57 */     this.a = (RootCommandNode<dd>)a.a(arrayOfA[☃.i()]);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/*  62 */     Object2IntMap<CommandNode<dd>> object2IntMap = a(this.a);
/*  63 */     CommandNode[] arrayOfCommandNode = (CommandNode[])a(object2IntMap);
/*     */     
/*  65 */     ☃.d(arrayOfCommandNode.length);
/*  66 */     for (CommandNode<dd> commandNode : arrayOfCommandNode) {
/*  67 */       a(☃, commandNode, (Map)object2IntMap);
/*     */     }
/*  69 */     ☃.d(object2IntMap.get(this.a).intValue());
/*     */   }
/*     */   
/*     */   private static void a(a[] ☃) {
/*  73 */     List<a> list = Lists.newArrayList((Object[])☃);
/*  74 */     while (!list.isEmpty()) {
/*  75 */       boolean bool = list.removeIf(a1 -> a1.a(☃));
/*  76 */       if (!bool) {
/*  77 */         throw new IllegalStateException("Server sent an impossible command tree");
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private static Object2IntMap<CommandNode<dd>> a(RootCommandNode<dd> ☃) {
/*  83 */     Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
/*  84 */     Queue<CommandNode<dd>> queue = Queues.newArrayDeque();
/*  85 */     queue.add(☃);
/*     */     
/*     */     CommandNode<dd> commandNode;
/*  88 */     while ((commandNode = queue.poll()) != null) {
/*  89 */       if (object2IntOpenHashMap.containsKey(commandNode)) {
/*     */         continue;
/*     */       }
/*  92 */       int i = object2IntOpenHashMap.size();
/*  93 */       object2IntOpenHashMap.put(commandNode, i);
/*  94 */       queue.addAll(commandNode.getChildren());
/*  95 */       if (commandNode.getRedirect() != null) {
/*  96 */         queue.add(commandNode.getRedirect());
/*     */       }
/*     */     } 
/*  99 */     return (Object2IntMap<CommandNode<dd>>)object2IntOpenHashMap;
/*     */   }
/*     */ 
/*     */   
/*     */   private static CommandNode<dd>[] a(Object2IntMap<CommandNode<dd>> ☃) {
/* 104 */     CommandNode[] arrayOfCommandNode = new CommandNode[☃.size()];
/* 105 */     for (ObjectIterator<Object2IntMap.Entry<CommandNode<dd>>> objectIterator = Object2IntMaps.fastIterable(☃).iterator(); objectIterator.hasNext(); ) { Object2IntMap.Entry<CommandNode<dd>> entry = objectIterator.next();
/* 106 */       arrayOfCommandNode[entry.getIntValue()] = (CommandNode)entry.getKey(); }
/*     */     
/* 108 */     return (CommandNode<dd>[])arrayOfCommandNode;
/*     */   }
/*     */   
/*     */   private static a c(nf ☃) {
/* 112 */     byte b = ☃.readByte();
/* 113 */     int[] arrayOfInt = ☃.b();
/* 114 */     int i = ((b & 0x8) != 0) ? ☃.i() : 0;
/* 115 */     ArgumentBuilder<dd, ?> argumentBuilder = a(☃, b);
/* 116 */     return new a(argumentBuilder, b, i, arrayOfInt);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static ArgumentBuilder<dd, ?> a(nf ☃, byte b) {
/* 121 */     int i = b & 0x3;
/* 122 */     if (i == 2) {
/* 123 */       String str = ☃.e(32767);
/* 124 */       ArgumentType<?> argumentType = fk.a(☃);
/* 125 */       if (argumentType == null) {
/* 126 */         return null;
/*     */       }
/* 128 */       RequiredArgumentBuilder<dd, ?> requiredArgumentBuilder = RequiredArgumentBuilder.argument(str, argumentType);
/* 129 */       if ((b & 0x10) != 0) {
/* 130 */         requiredArgumentBuilder.suggests(fm.a(☃.p()));
/*     */       }
/* 132 */       return (ArgumentBuilder<dd, ?>)requiredArgumentBuilder;
/*     */     } 
/* 134 */     if (i == 1) {
/* 135 */       return (ArgumentBuilder<dd, ?>)LiteralArgumentBuilder.literal(☃.e(32767));
/*     */     }
/* 137 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void a(nf ☃, CommandNode<dd> commandNode, Map<CommandNode<dd>, Integer> map) {
/* 142 */     byte b = 0;
/* 143 */     if (commandNode.getRedirect() != null) {
/* 144 */       b = (byte)(b | 0x8);
/*     */     }
/* 146 */     if (commandNode.getCommand() != null) {
/* 147 */       b = (byte)(b | 0x4);
/*     */     }
/*     */     
/* 150 */     if (commandNode instanceof RootCommandNode) {
/* 151 */       b = (byte)(b | 0x0);
/* 152 */     } else if (commandNode instanceof ArgumentCommandNode) {
/* 153 */       b = (byte)(b | 0x2);
/* 154 */       if (((ArgumentCommandNode)commandNode).getCustomSuggestions() != null) {
/* 155 */         b = (byte)(b | 0x10);
/*     */       }
/* 157 */     } else if (commandNode instanceof LiteralCommandNode) {
/* 158 */       b = (byte)(b | 0x1);
/*     */     } else {
/* 160 */       throw new UnsupportedOperationException("Unknown node type " + commandNode);
/*     */     } 
/*     */     
/* 163 */     ☃.writeByte(b);
/*     */     
/* 165 */     ☃.d(commandNode.getChildren().size());
/* 166 */     for (CommandNode<dd> commandNode1 : (Iterable<CommandNode<dd>>)commandNode.getChildren()) {
/* 167 */       ☃.d(((Integer)map.get(commandNode1)).intValue());
/*     */     }
/*     */     
/* 170 */     if (commandNode.getRedirect() != null) {
/* 171 */       ☃.d(((Integer)map.get(commandNode.getRedirect())).intValue());
/*     */     }
/*     */     
/* 174 */     if (commandNode instanceof ArgumentCommandNode) {
/* 175 */       ArgumentCommandNode<dd, ?> argumentCommandNode = (ArgumentCommandNode)commandNode;
/* 176 */       ☃.a(argumentCommandNode.getName());
/* 177 */       fk.a(☃, argumentCommandNode.getType());
/* 178 */       if (argumentCommandNode.getCustomSuggestions() != null) {
/* 179 */         ☃.a(fm.a(argumentCommandNode.getCustomSuggestions()));
/*     */       }
/* 181 */     } else if (commandNode instanceof LiteralCommandNode) {
/* 182 */       ☃.a(((LiteralCommandNode)commandNode).getLiteral());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(om ☃) {
/* 188 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public RootCommandNode<dd> b() {
/* 192 */     return this.a;
/*     */   }
/*     */   
/*     */   static class a {
/*     */     @Nullable
/*     */     private final ArgumentBuilder<dd, ?> a;
/*     */     private final byte b;
/*     */     private final int c;
/*     */     private final int[] d;
/*     */     @Nullable
/*     */     private CommandNode<dd> e;
/*     */     
/*     */     private a(@Nullable ArgumentBuilder<dd, ?> ☃, byte b, int i, int[] arrayOfInt) {
/* 205 */       this.a = ☃;
/* 206 */       this.b = b;
/* 207 */       this.c = i;
/* 208 */       this.d = arrayOfInt;
/*     */     }
/*     */     
/*     */     public boolean a(a[] ☃) {
/* 212 */       if (this.e == null) {
/* 213 */         if (this.a == null) {
/* 214 */           this.e = (CommandNode<dd>)new RootCommandNode();
/*     */         } else {
/* 216 */           if ((this.b & 0x8) != 0) {
/* 217 */             if ((☃[this.c]).e == null) {
/* 218 */               return false;
/*     */             }
/* 220 */             this.a.redirect((☃[this.c]).e);
/*     */           } 
/*     */           
/* 223 */           if ((this.b & 0x4) != 0) {
/* 224 */             this.a.executes(☃ -> 0);
/*     */           }
/*     */           
/* 227 */           this.e = this.a.build();
/*     */         } 
/*     */       }
/*     */       
/* 231 */       for (int i : this.d) {
/* 232 */         if ((☃[i]).e == null) {
/* 233 */           return false;
/*     */         }
/*     */       } 
/*     */       
/* 237 */       for (int i : this.d) {
/* 238 */         CommandNode<dd> commandNode = (☃[i]).e;
/* 239 */         if (!(commandNode instanceof RootCommandNode)) {
/* 240 */           this.e.addChild(commandNode);
/*     */         }
/*     */       } 
/*     */       
/* 244 */       return true;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\pd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */